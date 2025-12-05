public class freq {
    public static void main(String[] args) {
        
        freq f=new freq();
        int []ar={1,2,3,4,2,3,4,2,5,2};
        int k=2;
        System.out.println(f.solve(ar,k));
    
    }
    public int solve(int []ar, int k){
        int n=ar.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(ar[i]==k){
                count++;
            }
        }
        return count;
    }
}
