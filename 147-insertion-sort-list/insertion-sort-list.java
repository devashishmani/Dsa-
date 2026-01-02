class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0); // dummy head of sorted list
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // store next node

            // find position to insert
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            curr = nextNode;
        }

        return dummy.next;
    }
}
