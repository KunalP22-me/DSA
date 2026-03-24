//Problem 24 Leetcode

class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode left = head;
        ListNode res = null;
        ListNode prevleft = null;

        while (left != null) {

            ListNode right = left;

            // move right to 2nd node
            for (int i = 0; i < 1; i++) {
                if (right == null) break;
                right = right.next;
            }

            // if less than 2 nodes → stop
            if (right == null) {
                if (prevleft != null) prevleft.next = left;
                break;
            }

            ListNode nextleft = right.next;

            // reverse 2 nodes manually
            right.next = left;
            left.next = null;

            // connect previous part
            if (prevleft != null) {
                prevleft.next = right;
            }

            // set result head
            if (res == null) {
                res = right;
            }

            prevleft = left;
            left = nextleft;
        }

        return res;
    }
}
