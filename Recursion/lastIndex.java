import java.util.ArrayList;

public class lastIndex {
    public int LastIndex(ArrayList<Integer> A, int B) {
        return helper(A, B, 0);
    }

    public int helper(ArrayList<Integer> A, int B, int index) {
        if (index == A.size()) return -1;

        int ans = helper(A, B, index + 1);
        if (ans != -1) return ans;
        if (A.get(index) == B) return index;

        return -1;
    }

    public static void main(String[] args) {
        lastIndex sol = new lastIndex();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(2);

        int target = 3;
        int result = sol.LastIndex(list, target);
        System.out.println("Last index of " + target + " is: " + result);
    }
}
