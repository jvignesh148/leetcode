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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node=new ListNode(0);
        ListNode temp=head,dummy=node;
        while(temp!=null){
            int count=0;
            ListNode curr=temp;
            while(temp!=null && count<k){
                temp=temp.next;
                count++;
            }
            if(count<k) break;
            ListNode newNode=reverse(curr,temp);
            dummy.next=newNode;
            curr.next=temp;
            dummy=curr;
        }
        return node.next;
    }
    public ListNode reverse(ListNode node,ListNode end){
        ListNode temp=node,prev=end;
        while(temp!=end){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}