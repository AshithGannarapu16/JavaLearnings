import java.util.*;

public class sumofodd {

    public ArrayList<Integer> sumOfOddIndexedElements(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int N = A.size();
        int[] c_arr = new int[N];
        for (int i = 0; i < N; i++) {
            if (i % 2 != 0) {
                c_arr[i] = A.get(i);
            } else {
                c_arr[i] = 0;
            }
        }
        int[] p_sum = new int[N];
        p_sum[0] = c_arr[0];
        for (int i = 1; i < N; i++) {
            p_sum[i] = p_sum[i - 1] + c_arr[i];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            int L = B.get(i).get(0);
            int R = B.get(i).get(1);

            if (L == 0) {
                ans.add(p_sum[R]);
            } else {
                ans.add(p_sum[R] - p_sum[L - 1]);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        sumofodd obj = new sumofodd();

        // Sample input
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        B.add(new ArrayList<>(Arrays.asList(1, 3)));  // sum odd indexed elements in range 1 to 3
        B.add(new ArrayList<>(Arrays.asList(0, 5)));  // sum odd indexed elements in range 0 to 5

        ArrayList<Integer> result = obj.sumOfOddIndexedElements(A, B);

        // Print results
        for (Integer val : result) {
            System.out.println(val);
        }
    }
}
