public class towerOfhanoi {
    public void solve(int n, String source, String destination, String auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solve(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solve(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        towerOfhanoi obj = new towerOfhanoi();
        int n = 3; // Example input
        obj.solve(n, "A", "C", "B");
    }
}