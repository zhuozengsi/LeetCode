/**
 * Created by zhuozengsi on 3/9/16.
 * ou are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */



public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode tail = listNode;
        boolean isLargerTen = false;
        while(isLargerTen || l1 != null || l2 != null){
            int sum = 0;
            if (l1 !=null && l2 != null){
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 != null){
                sum = l1.val;
                l1 = l1.next;
            } else if(l2 != null){
                sum = l2.val;
                l2 = l2.next;
            }
            if(isLargerTen)
                sum ++;
            if(sum >= 10){
                isLargerTen = true;
                sum %= 10;
            }else
                isLargerTen = false;

            tail.next = new ListNode(sum);
            tail = tail.next;
        }

        return listNode.next;
    }

    public int listToInt(ListNode l){
        int num = 0;
        int pow = 0;
        while(l != null){
            num += l.val * Math.pow(10, pow ++);
            l = l.next;
        }
        return num;
    }

    public ListNode intToList(long num){
        ListNode listNode = new ListNode(0);
        ListNode tail = listNode;
        if(num == 0){
            return listNode;
        }
        while (num != 0){
            ListNode node = new ListNode((int)num % 10);
            tail.next = node;
            tail = tail.next;
            num /= 10;
        }

        return listNode.next;
    }

    public void printList(ListNode node){
        while (node.next != null){
            System.out.print(node.val + "->");
            node= node.next;
        }
        System.out.print(node.val);
    }

    public static void main(String[] args){
        int num = 9;
        long num2 = 999999991;
        Solution solution = new Solution();
        ListNode listNode1 = solution.intToList(num);
        ListNode listNode2 = solution.intToList(num2);
        solution.printList(listNode1);
        System.out.print("\n");
        solution.printList(listNode2);
        System.out.print("\n");
        ListNode listNode = solution.addTwoNumbers(listNode1, listNode2);
        solution.printList(listNode);
    }
}
