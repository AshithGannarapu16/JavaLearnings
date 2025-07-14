class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class countNodes {
    int cnt = 0;

    public int solve(TreeNode root, int B, int C) {
        preorder(root, B, C);
        return cnt;
    }

    public void preorder(TreeNode node, int B, int C) {
        if (node == null) return;
        
        if (node.val >= B && node.val <= C) {
            cnt++;
        }

        preorder(node.left, B, C);
        preorder(node.right, B, C);
    }

    public static void main(String[] args) {
        // 🔧 Constructing the binary tree manually
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        // 🎯 Range: 6 to 16
        countNodes sol = new countNodes();
        int result = sol.solve(root, 6, 16);
        
        System.out.println("Nodes in range [6, 16]: " + result);

    }
    

}
