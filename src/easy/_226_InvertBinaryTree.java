package easy;

import utils.TreeNode;

public class _226_InvertBinaryTree {
    /**
     * 226. Invert Binary Tree
     * @param root of a binary tree
     * @return invert the tree, and return its root
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
