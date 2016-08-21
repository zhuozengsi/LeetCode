/**
 * Created by zhuozengsi on 8/19/16.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    private class TreeNode {
             int val;
            TreeNode left;
            TreeNode right;
             TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {


        if(p == null && q == null) return true;

        else if((p == null && q != null) || (p != null && q == null)) return false;

        else
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);



    }
}
