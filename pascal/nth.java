public class nth {
    public static long nCr(int n, int r) {
        long ans = 1;
        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i + 1);
            ans = ans / i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println("nCr of " + n + " and " + r + " is " + nCr(n, r));
    }
}
