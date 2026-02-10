//Problem 86 Leetcode

class Solution {
    public ListNode partition(ListNode head, int x) {

        if(head==null || head.next==null) return head;
        
        ListNode largedummy = new ListNode(0);
        ListNode smalldummy = new ListNode(0);

        ListNode p1 = head;
        ListNode small = smalldummy;
        ListNode large = largedummy;

        while(p1!=null){

            if( p1.val<x ){
                small.next=p1;
                small=small.next;
            }
            else{
                large.next=p1;
                large=large.next;
            }
            p1=p1.next;
        }

        large.next = null;
        
        small.next=largedummy.next;

        return smalldummy.next;
    }
}
