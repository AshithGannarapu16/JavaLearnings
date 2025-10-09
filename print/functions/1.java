
import java.util.Scanner;

public class fun{
    static void Sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum = "+sum);

    }

    static void greet(){
        System.out.println("Hello");
    }
    static void ashith(){
        System.out.println("Ashith");
    }
    public static void main(String[] args) {
        Sum();
        ashith();
        greet();


        
    }
}