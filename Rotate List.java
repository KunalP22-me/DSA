//Problem 61 Leetcode

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // 1. Find length and tail
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 2. Make it circular
        tail.next = head;

        // 3. Find new tail
        int steps = length - (k % length) -1;
        ListNode newTail = head;
        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }

        // 4. Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
