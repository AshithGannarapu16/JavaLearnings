// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int val=1;
    for(int i=1;i<=N;i++){
      
      for(int j=1;j<=i;j++){
        System.out.print(val+" ");
        val++;

      }
      System.out.println();
    }
  }
}