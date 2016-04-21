/**
 * Created by zhuozengsi on 4/21/16.
 */
public class Solution {

    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;
        ListNode left = head;
        ListNode right = head;
        int length  = 1;
        while(right.next != null){
            right = right.next;
            length ++;
        }

        if(length <= 2) return head;

        for(int i = 1; i < length; i += 2){
                right.next = left.next;
                left.next = left.next.next;
                right = right.next;
                right.next = null;
                left = left.next;
        }

        return head;
    }

    public void printList(ListNode n){

        while (n.next != null){
            System.out.print(n.val + "->");
            n = n.next;
        }
        System.out.println(n.val);

    }
}
