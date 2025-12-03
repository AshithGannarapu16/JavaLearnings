public class max {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // int n = arr.length;  // default value for n
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
