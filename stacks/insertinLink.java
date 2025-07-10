public class insertinLink {
    public void insert(int[] arr, int n, int value) {
        if (n == 0 || arr[n - 1] <= value) {
            arr[n] = value;
            return;
        }
        arr[n] = arr[n - 1];
        insert(arr, n - 1, value);
    }

    public static void main(String[] args) {
        insertinLink obj = new insertinLink();
        int[] arr = new int[5]; // Example array with size 5
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        int n = 3; // Current number of elements
        int value = 25; // Value to be inserted
        obj.insert(arr, n, value);
        
        // Print the array after insertion
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}