public  class  print1toN{
    public static void Print1ToN(int n){
        if(n==0) return;
        Print1ToN(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n=5;
        Print1ToN(n);
        System.out.println();
    }
}