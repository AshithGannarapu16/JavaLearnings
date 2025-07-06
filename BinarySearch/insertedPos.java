public class insertedPos {
    public int searchInsert(int[] A, int B) {
        int low=0;
        int high=A.length-1;
      

        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==B){
                return mid;
            }else if(A[mid]<B){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        insertedPos ip = new insertedPos();
        int[] A = {1, 3, 5, 6};
        int B = 5;
        int result = ip.searchInsert(A, B);
        System.out.println("Insert position for " + B + " is: " + result);
    }
}
