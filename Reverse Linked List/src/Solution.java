/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {

    public ListNode reverseList(ListNode head) {

        if(head == null) return null;

        ListNode preNode = null;
        ListNode curNode = head;

        while (curNode != null){

            ListNode next = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = next;

        }

        return preNode;


    }

}
