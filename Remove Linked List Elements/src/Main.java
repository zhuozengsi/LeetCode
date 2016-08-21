/**
 * Created by zhuozengsi on 6/7/16.
 */
public class Main {

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node1.next = node2;
//        ListNode node3 = new ListNode(6);
//        node2.next = node3;
//        ListNode node4 = new ListNode(3);
//        node3.next = node4;
//        ListNode node5 = new ListNode(4);
//        node4.next = node5;
//        ListNode node6 = new ListNode(5);
//        node5.next = node6;
//        ListNode node7 = new ListNode(6);
//        node6.next = node7;

        print(node1);
        Solution solution = new Solution();
        print(solution.removeElements(node1, 1));

    }

    private static void print(ListNode node){
        if(node == null) {
            System.out.println("[]");
            return;
        }
        ListNode p = node;
        while (p.next != null){
            System.out.print(p.val + "->");
            p = p.next;
        }

        System.out.println(p.val);
    }

}
