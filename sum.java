
import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        // for(int i=0;i<5;i++){
        //     System.out.println("Hello");
        //     break;
        // }  
        // for(int i=3;i<=4;i++){
        //     for(int j=2;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("HEY");
        // } 

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(greater(a,b));


    }
    static int greater(int a ,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}