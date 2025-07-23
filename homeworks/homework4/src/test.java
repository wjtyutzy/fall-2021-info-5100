public class test {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        root.next = two;
        two.next = three;
        three.next = four;
        reorderList(root);

    }
    public static void reorderList(ListNode head) {
        //step 1: find middle node and cut off the list
        ListNode firstHalfEnd = findMiddleNode(head);
        //step 2: reverse the second half
        ListNode secondHalfStart = reverseLinkedList(firstHalfEnd.next);
        firstHalfEnd.next = null;
        //step 3: merge two half lists
        mergeTwoLinkedLists(head, secondHalfStart);
    }

    private static ListNode findMiddleNode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverseLinkedList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        //iteration
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private static ListNode mergeTwoLinkedLists(ListNode headA, ListNode headB) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while(headA != null && headB != null) {
            cur.next = headA;
            cur = cur.next;
            headA = headA.next;
            cur.next = headB;
            cur = cur.next;
            headB = headB.next;

//            cur.next = headA;
//            cur.next.next = headB;
//            cur = cur.next.next;
//            headA = headA.next;
//            headB = headB.next;
        }
        //cur.next = headB == null ? headA : null;
        cur.next = headA;
        return dummyHead.next;
    }
    static class ListNode {
        int val;
    ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
