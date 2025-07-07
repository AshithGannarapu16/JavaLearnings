public class Main {

    public static int binarySearch(int[] a, int target) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11};
        int target = 5;
        System.out.println("Index of " + target + " is: " + binarySearch(a, target));
    }
}