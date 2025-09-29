import java.util.Scanner;

public  class  start{
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] prefixSum = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            prefixSum[i] = arr[i] + (i > 0 ? prefixSum[i - 1] : 0);
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(prefixSum[i - 1] + " ");
        }
        
    }
}