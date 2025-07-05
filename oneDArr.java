
public class OneDArr {
    int maximumSubarraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}