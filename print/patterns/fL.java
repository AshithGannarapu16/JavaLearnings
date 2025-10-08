
import java.util.Scanner;

public class fL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last=n%10;

        int first=0;
        for( ;n>0;n=n/10){
            first=n%10;
        }
        System.out.println(first+" "+last);
    }
}

 