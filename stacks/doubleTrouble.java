public class doubleTrouble {
    public void printDouble(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n * 2 + " ");
        printDouble(n - 1);
    }

    public static void main(String[] args) {
        doubleTrouble obj = new doubleTrouble();
        int n = 5; // Example input
        obj.printDouble(n);
    }
}