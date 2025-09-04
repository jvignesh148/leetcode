/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
        ListNode list=new ListNode(-5001);
        ListNode temp=head;
        while(temp!=null){
            ListNode prev=list,next=temp.next;
            while(prev.next!=null && prev.next.val<temp.val) prev=prev.next;
            temp.next=prev.next;
            prev.next=temp;
            temp=next;
        }
        return list.next;
    }
}