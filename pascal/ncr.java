public class ncr{
    public   static void main(String[] args) {
        int n = 5; // Example value for n
        int r = 2; // Example value for r
        System.out.println("nCr of " + n + " and " + r + " is: " + nCr(n, r));
    }  
    public static long nCr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}