/**
 * Created by zhuozengsi on 6/7/16.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode first = new ListNode(0);
        first.next = head;
        ListNode pointer = first;
        while (pointer != null && pointer.next != null){

            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }else {
                pointer = pointer.next;
            }
        }

        return first.next;
    }
}
