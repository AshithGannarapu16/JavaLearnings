public class fib{
    public int Fib(int n){
        if(n==0||n==1) return n;
        return Fib(n-1) + Fib(n-2);
    }
    public static void main(String[] args) {
        fib obj = new fib();
        int n = 5; // Example input
        int result = obj.Fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}