public class Swap{
    public static void main(String[] args) {
        
        // int a=10;
        // int b=20;

        // //swap
        // int c=a;
        // a=b;
        // b=c;
        // System.out.println(a+" "+b);

        swap(10, 20);
    }

    static void swap(int a, int b){
        int temp=a;
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    
        System.out.println(a + " " + b);
    }
