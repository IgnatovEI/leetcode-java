package easy;

import utils.TreeNode;

public class _100_SameTree {
    /**
     * 100. Same Tree
     * @param p root of binary tree
     * @param q root of binary tree
     * @return true if the two trees are same
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
