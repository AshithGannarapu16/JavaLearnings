public class slidWind{
    public int[] slidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k <= 0 || k > n) {
            return new int[0]; // Return empty array for invalid input
        }
        int[] result = new int[n - k + 1];
        int maxIndex = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] > arr[maxIndex]) {
               
                maxIndex = i; // Find the maximum in the first window
            }
        } 
        result[0] = arr[maxIndex]; // Store the maximum of the first window
        for (int i = k; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; // Update maxIndex if the new element is greater
            } else if (maxIndex <= i - k) {
                maxIndex = i - k + 1; // Reset maxIndex if it is out of the current window
                for (int j = i - k + 1; j <= i; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j; // Find the new maximum in the current window
                    }
                }
            }
            result[i - k + 1] = arr[maxIndex]; // Store the maximum of the current window
        }
        return result; // Return the array of maximums

    }  
    
}