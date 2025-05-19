package easy;

import utils.TreeNode;

public class _2236_RootEqualsSumOfChildren {
    /**
     * 2236. Root Equals Sum of Children
     * @param root of a binary tree that consists of exactly 3 nodes:
     * the root, its left child, and its right child
     * @return true if the value of the root is equal
     * to the sum of the values of its two children, or false otherwise
     */
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
