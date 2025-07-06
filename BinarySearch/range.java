public class range {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int target) {
        int leftMost=findLeftMost(A,target);
        int rightMost=findRightMost(A,target);
        if(leftMost==-1||rightMost==-1){
            return new int[] {-1,-1};
        }
        return new int[] {leftMost,rightMost};
    }

    public int findLeftMost(int [] A,int target){
        int low=0,high=A.length-1,leftMost=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==target){
                leftMost=mid;
                high=mid-1;
            }else if(A[mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return leftMost;
    }
    public int findRightMost(int [] A,int target){
        int low=0, high=A.length-1,rightMost=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==target){
                rightMost=mid;
                low=mid+1;
            }else if(A[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return rightMost;
    }
    public static void main(String[] args) {
        range r = new range();
        int[] A = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = r.searchRange(A, target);
        System.out.println("Leftmost and rightmost indices: " + result[0] + ", " + result[1]);
    }

}
