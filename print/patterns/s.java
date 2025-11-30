import java.util.*;
public class s{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        System.out.print("*");
        for(int j=0;j<=n-1;j++){
            System.out.print("_");
        }
        System.out.println("*");
       } 
    }
}