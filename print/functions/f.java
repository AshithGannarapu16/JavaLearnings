
import java.util.Scanner;

class f{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=calFact(n);
        System.out.println(res);
        // int fact=1;
        // for(int i=1;i<=5;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);


    }
    public static int calFact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }       
         return fact;
    }
}