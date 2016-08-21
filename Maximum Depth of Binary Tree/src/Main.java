/**
 * Created by zhuozengsi on 8/18/16.
 */
public class Main {

    public static void main(String[] args){

        TreeNode node = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node3.right = node4;

        System.out.println("max length: " + new Solution().maxDepth(node));


    }


}
