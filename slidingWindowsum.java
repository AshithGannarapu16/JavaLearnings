public class slidingWindowsum{
    public static int maxSum(int[] arr,int k){
        int N=arr.length;
        int maxSum=0;
        int windowSum=0;

        for(int i=0;i<k;i++){
            windowSum =windowSum+arr[i];
        }
        maxSum=windowSum;

        for(int i=k;i<arr.length;i++){
            windowSum =windowSum+arr[i]-arr[i-1];
            maxSum=Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        int k=3;
        System.out.println("Max sum of subarray of size k: "+maxSum(arr, k));
    }
}