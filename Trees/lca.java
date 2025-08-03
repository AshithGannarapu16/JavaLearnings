class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class lca {
    public TreeNode Lca(TreeNode A, int B, int C) {
        if (A == null) {
            return null;
        }

        if (A.val == B || A.val == C) {
            return A;
        }

        TreeNode leftLca = Lca(A.left, B, C);
        TreeNode rightLca = Lca(A.right, B, C);

        if (leftLca != null && rightLca != null) {
            return A;
        }

        return (leftLca != null) ? leftLca : rightLca;
    }

    public static void main(String[] args) {
        // Example tree:
        //      3
        //     / \
        //    5   1
        //   / \ / \
        //  6  2 0  8
        //    / \
        //   7   4
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        lca solution = new lca();
        int B = 5, C = 1;
        TreeNode lca = solution.Lca(root, B, C);
        if (lca != null) {
            System.out.println("LCA of " + B + " and " + C + " is: " + lca.val);
        } else {
            System.out.println("LCA not found.");
        }
    }
}