public class  Bs{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78};
        int target=66;
        System.out.println(Search(arr, target, 0, arr.length-1));
    }

    static int Search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return  m;
        }
        if(target<arr[m]){
            return  Search(arr, target, s, e-1);
        }
        return Search(arr, target, s+1, e);
    }
}