public class incre{
    public static void main(String[] args) {
        printIncre(5);
    }
    static void printIncre(int n){
        if(n==0){
            return;
        }
        printIncre(n-1);
        System.out.println(n);
    }
}