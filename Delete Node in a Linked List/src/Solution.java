/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {
    public void deleteNode(ListNode node) {

        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;


    }
}