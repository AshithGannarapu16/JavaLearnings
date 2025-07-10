public class revInlist {
    public void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // Swap the elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call to reverse the next pair
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        revInlist obj = new revInlist();
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        obj.reverse(arr, 0, arr.length - 1);
        
        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}