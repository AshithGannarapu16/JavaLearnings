public class spaceOpt {
    public int fibonacci_optimized(int n) {
    if (n <= 1) {
        return n;
    }

    int a = 0; // Represents F(i-2)
    int b = 1; // Represents F(i-1)
    int c = 0; // Represents F(i)

    for (int i = 2; i <= n; i++) {
        c = a + b; // Current F(i)
        a = b;     // F(i-2) becomes the old F(i-1)
        b = c;     // F(i-1) becomes the new F(i)
    }

    return b; // Or c, since the loop ends after updating b/c
}
// Time Complexity: O(N)
// Space Complexity: O(1)
}
