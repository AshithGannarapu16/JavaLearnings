public class firstIndex{
    public int firstIndex(int[] arr, int x, int index) {
        if (index == arr.length) {
            return -1; // Base case: if we reach the end of the array
        }
        if (arr[index] == x) {
            return index; // Found the first occurrence of x
        }
        return firstIndex(arr, x, index + 1); // Recursive call with next index
    }

    public static void main(String[] args) {
        firstIndex obj = new firstIndex();
        int[] arr = {1, 2, 3, 4, 5, 3};
        int x = 3; // Element to find
        int result = obj.firstIndex(arr, x, 0);
        System.out.println("First index of " + x + " is: " + result);
    }
}