
import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=1;j<=(n+1-i);j++){
                System.out.print("_");
            }
            System.out.println("*");
        }
    }
}
