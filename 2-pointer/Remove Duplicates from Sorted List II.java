//Problem 82 Leetcode

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode l = head;
        ListNode r = head.next;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(r!=null){
            if(r.val==l.val){
                while(r!=null && r.val==l.val){
                    r=r.next;
                }
                prev.next=r;
                l=r;
                if(r!=null) r=r.next;
            }

            else{
                l=l.next;
                r=r.next;
                prev=prev.next;
            }
        }
        
        return dummy.next;
    }
}
