public class slide {

    public static int findMaxSumSubArray(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            return -1; // Or handle as appropriate
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // 1. Calculate sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // 2. Slide the window one element at a time
        for (int i = k; i < arr.length; i++) {
            // Add the new element (positive contribution)
            windowSum += arr[i];

            // Subtract the element leaving the window (negative contribution)
            windowSum -= arr[i - k];

            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, -1, 7, -1, 5, 4};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + ": " + findMaxSumSubArray(arr, k)); // Output: 11 (from [7, -1, 5])
    }
}
