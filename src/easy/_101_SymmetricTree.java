package easy;

import utils.TreeNode;

public class _101_SymmetricTree {
    /**
     * 101. Symmetric Tree
     * @param root of a binary tree
     * @return true if it is a mirror of itself
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
