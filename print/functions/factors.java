class factors {
    public static void main(String[] args) {
        System.out.println(sumOfFactors(4));
    }

    static int sumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}