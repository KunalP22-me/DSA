//Problem 2 Leetcode

class Solution { 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l = head;
        int c=0; 

        while(l1!=null || l2!=null || c!=0){ 

            int v1 = (l1!=null) ? l1.val :0;
            int v2 = (l2!=null) ? l2.val :0;

            int sum = v1 + v2 + c;
            c= sum/10;

            l.next =new ListNode(sum%10);
            l=l.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        return head.next;
    }
}
