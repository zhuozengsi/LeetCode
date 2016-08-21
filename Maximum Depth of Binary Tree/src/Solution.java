/**
 * Created by zhuozengsi on 8/18/16.
 */

import java.util.ArrayList;
import java.util.List;

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
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }

}