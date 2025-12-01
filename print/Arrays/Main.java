

public class Main {
    public static void main(String[] args) {
        int n = maxOfTwo(new int[]{-10, -2, -6, -4, -1});
        System.out.println(n);
    }
    
    public static int maxOfTwo(int[] a) {
        int max = a[0]; // initialize max to first element
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
 
