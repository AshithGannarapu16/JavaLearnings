// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void main(String[] args) {
      System.out.println("Hello, World!");

      Scanner sc=new Scanner(System.in);

      int A=sc.nextInt();
      int B=sc.nextInt();
      int C=sc.nextInt();

      if((A==B)&&(B==C)){
        System.out.println("Equillateral");
      }else if((A==B)||(B==C)||(A==C)){
        System.out.println("Isoscles");
      }else{
        System.out.println("Scalene");
      }
  }
}