public class squareRoot {
    public int sqrt(int A) {
        if(A==0){
            return 0;
        }
        long lo=1;
        long hi=A;
        long ans=1;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*mid==A){
              return (int) mid;
            }else if(mid*mid<A){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return  (int) ans;
    }

    public static void main(String[] args) {
         squareRoot sr = new squareRoot();
         int A = 16;
        int result = sr.sqrt(A);
        System.out.println("Square root of " + A + " is: " + result);
    }
 }


