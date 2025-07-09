public class facN{
    public int sumOfDigits(int n){
        if(n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        facN obj = new facN();
        int n = 12345;
        int sum = obj.sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }
}