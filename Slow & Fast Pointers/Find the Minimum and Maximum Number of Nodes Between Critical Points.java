//Problem 2058 Leetcode
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = head.next.next;
        int i = 1;

        int fst = 0;
        int lst = 0;
        int min = Integer.MAX_VALUE;

        while (nxt != null) {
            if (critic(prev, curr, nxt)) {
                if (fst == 0)
                    fst = i;
                else
                    min = Math.min(min, i - lst);
                lst = i;
            }
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
            i++;
        }

        if(fst==lst) return new int[] {-1,-1};

        return new int[] {min, lst-fst};
    }

    private boolean critic (ListNode a, ListNode b, ListNode c){
        return (a.val < b.val && b.val> c.val) || (a.val > b.val && b.val< c.val);
    }
}
