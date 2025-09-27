import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number
        int sum = 0;
        int copy = n;           // store original number

        // extract digits one by one
        for (; n > 0; n = n / 10) {
            int d = n % 10;             // get last digit
            sum = sum + (d * d * d);    // cube and add to sum
        }

        // check Armstrong condition
        if (sum == copy) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
