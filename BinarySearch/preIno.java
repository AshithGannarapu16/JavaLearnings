/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *         val = x;
 *         left = null;
 *         right = null;
 *     }
 * }
 */
import java.util.ArrayList;
public class preIno {
    ArrayList<Integer> preorder;
    ArrayList<Integer> inorder;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null || A.size() == 0 || B.size() == 0 || A.size() != B.size()) {
            return null;
        }

        this.preorder = A;
        this.inorder = B;
        return rec(0, inorder.size() - 1, 0);
    }

    public TreeNode rec(int start, int end, int index) {
        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preorder.get(index));

        int i = start;
        while (i <= end) {
            if (inorder.get(i).intValue() == root.val) {
                break;
            }
            i++;
        }

        int leftTreeSize = i - start;

        root.left = rec(start, i - 1, index + 1);
        root.right = rec(i + 1, end, index + leftTreeSize + 1);

        return root;
    }

}
