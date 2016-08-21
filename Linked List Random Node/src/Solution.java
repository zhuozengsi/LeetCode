/**
 * Created by zhuozengsi on 8/17/16.
 */

import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    private int length = 0;
    private ListNode mHead;

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {

        mHead = head;

        while (head != null){
            length++;
            head = head.next;
        }

    }

    /** Returns a random node's value. */
    public int getRandom() {
        int index = new Random().nextInt(length);
        ListNode curNode = mHead;
        int value = 0;
        for(int i = 0; i <= index; i ++){
            value = curNode.val;
            curNode = curNode.next;

        }



        return value;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */