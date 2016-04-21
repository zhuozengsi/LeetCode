/**
 * Created by zhuozengsi on 4/21/16.
 */
public class Main {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Solution solution = new Solution();
        solution.printList(n1);
        solution.oddEvenList(n1);
        solution.printList(n1);


    }


}
