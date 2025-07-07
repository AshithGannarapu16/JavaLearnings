public class Solution {
public int countPages(int[]A,int mid){
int student= 1;
int page = 0;
for(int i=0;i<A.length;i++){
if(page+A[i]<=mid){
page+=A[i];
}
else{
student++;
page=A[i];
}
}
return student;
}
public int books(int[] A, int B) {
int n = A.length;
if(B>n){
return -1;
}
int low = Integer.MIN_VALUE;
int high = 0;
for(int i=0;i<n;i++){
low = Math.max(low,A[i]);
high+=A[i];
}
int ans = 0;
while(low<=high){
int mid = low+(high-low)/2;
int currPage = countPages(A,mid);
if(currPage<=B){
ans = mid;
high=mid-1;
}
else{
low=mid+1;
}
}
return ans;
}

public static void main(String[] args) {
    Solution sol = new Solution();
    int[] books = {12, 34, 67, 90};
    int students = 2;
    int result = sol.books(books, students);
    System.out.println("Minimum number of pages: " + result);
}
}
