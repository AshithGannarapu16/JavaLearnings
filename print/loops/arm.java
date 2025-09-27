public class arm{
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int copy=n;
        for(;n>0;n=n/10){
            int d=n%10;
            sum=sum+(d*d*d);
        }
        if(sum==copy){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}