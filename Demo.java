import java.util.*;

class Demo{
    public static void main(String [] args){
        // System.out.println("AshithGannarapu");

        // if(1<2){
        //     System.out.println("1 is less than 2");
        // }else
        //     System.out.println("1 is not less than 2");
        //     System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1, sum=0;

        while(i<=n){
            System.out.println(i);
            sum=sum+i;
            i++;
            
        }
        System.out.println(sum);
    }
}