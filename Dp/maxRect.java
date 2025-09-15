public class maxRect {
    public int maximalRectangle(int[][] A) {
        int N=A.length;
        int M=A[0].length;
        int [][] res=new int[N][M];
        
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]==0) continue;

                if(j==0)
                res[i][j]=1;
                
                else res[i][j]=1+res[i][j-1];

                
                int width=res[i][j];

                for(int k=i;k>=0;k--){
                    width =Math.min(width, res[i][j]);
                    int area=width*(i-k+1);

                    ans=Math.max(ans, area);
                }

            }
        }
        return ans;

    }
}
