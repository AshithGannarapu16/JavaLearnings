
import java.util.Scanner;

public class nf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int nf=1;
        for(int i=1;i<=n;i++){
            nf=nf*i;
        }

        int rf=1;
        for(int i=1;i<=r;i++){
            rf=rf*i;
        }

        int nrf=1;
        for(int i=1;i<=(n-r);i++){
            nrf=nrf*i;
        }

        int nCr=nf/(rf*nrf);
        System.out.println(nCr);
    }
}
