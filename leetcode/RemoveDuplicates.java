public class RemoveDuplicates {

}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode tempNode = head;
//        ListNode curNode = head.next;
//        while (curNode != null) {
//            if (tempNode.val == curNode.val) {
//                tempNode.next = curNode.next;
//                curNode = tempNode;
//            }
//            tempNode = curNode;
//            curNode = curNode.next;
//        }
//        return head;
//    }
//}