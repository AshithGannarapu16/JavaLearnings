import java.util.*;

public class star {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();

    for(int i=1;i<=N;i++){
        System.out.print("* ");

    for(int j=1;j<=N-1;j++){
        System.out.print("_ ");
    }    
    System.out.println("* ");
  }
  }
}