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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int i=1;
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode temp=head,dummy=node;
        while(temp!=null){
            int count=0;
            ListNode curr=temp;
            while(temp!=null && count<i){
                temp=temp.next;
                count++;
            }
            if(count%2==0){
                ListNode newNode=reverse(curr,temp);
                dummy.next=newNode;
                curr.next=temp;
                dummy=curr;
            }
            else{
                dummy=curr;
                for(int j=1;j<count;j++){
                    dummy=dummy.next;
                }
            }
            i++;
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