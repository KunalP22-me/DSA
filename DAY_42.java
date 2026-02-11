//Problem 21 Leetcode

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode i=list1;
        ListNode j=list2;
        ListNode res=new ListNode(0);
        ListNode resdummy=res;

        while(i!=null && j!=null){
            if(i.val <= j.val){
                resdummy.next=i;
                i=i.next;
            } else {
                resdummy.next=j;
                j=j.next;
            }
            resdummy = resdummy.next;
        }
        while(i!=null){
            resdummy.next=i;
            resdummy = resdummy.next;
            i=i.next;
        }
        while(j!=null){
            resdummy.next=j;
            resdummy = resdummy.next;
            j=j.next;
        }
        return res.next;
    }
}
