//Problem 83 Leetcode
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr=head;
        ListNode prev=new ListNode(-1000);

        while(curr!=null){

            if(curr.val==prev.val){

                prev.next=curr.next;
                curr=curr.next;

            }else{

                prev=curr;
                curr=curr.next;
            }
        }

        return head;
    }
}
