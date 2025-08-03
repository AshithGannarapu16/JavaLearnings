import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Pair {
    TreeNode node;
    int vl;
    Pair(TreeNode node, int vl) {
        this.node = node;
        this.vl = vl;
    }
}

public class topview {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null) return result;

        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int minvl = 0, maxvl = 0;

        q.add(new Pair(A, 0));
        while (!q.isEmpty()) {
            Pair rp = q.remove();
            minvl = Math.min(minvl, rp.vl);
            maxvl = Math.max(maxvl, rp.vl);
            if (!map.containsKey(rp.vl)) {
                map.put(rp.vl, rp.node.val);
            }
            if (rp.node.left != null) {
                q.add(new Pair(rp.node.left, rp.vl - 1));
            }
            if (rp.node.right != null) {
                q.add(new Pair(rp.node.right, rp.vl + 1));
            }
        }
        for (int i = minvl; i <= maxvl; i++) {
            result.add(map.get(i));
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        // Build the tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        topview tv = new topview();
        ArrayList<Integer> res = tv.solve(root);
        System.out.println(res); // Output: [2, 1, 3, 6]
    }
}