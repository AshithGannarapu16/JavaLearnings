
import java.util.Scanner;

public class dem{
    public static void main(String[] args) {
        System.out.println("Demo Class");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr={1,2,3,4,5};
        int c=0;
        for(int i=0;i<arr.length;i++){
           c=c+1;
           System.out.println(arr[i]+"   ");
        }
        System.out.println(c);
    }

}