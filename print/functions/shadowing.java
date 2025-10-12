public class shadowing {
    static int a=90;//global variable
    public static void main(String[] args) {
        System.out.println(a);
        int a=40;//local variable
        System.out.println(a);
        fun();
        
    }
    static void fun(){
        System.out.println(a);
    }   
}
