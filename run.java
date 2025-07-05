public class Run{
    public int[] solve(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        quickSort(A, 0, A.length - 1);
        return A;
    }
    public void quickSort(int[] arr,int lo,int hi){
        if(lo>=hi) return;
        int p=arr[(lo+hi)/2];
        int left=lo,right=hi;

        while(left<=right){
            while(arr[left]<p){
                left++;
            }
            while(arr[right]>p){
                right--;
            }
            if(left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        quickSort(arr,lo,right);
        quickSort(arr,left,hi);
    }
    public static void main(String[] args) {
        Run run = new Run();
        int[] A = {3, 6, 8, 10, 1, 2, 1};
        int[] sortedArray = run.solve(A);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
