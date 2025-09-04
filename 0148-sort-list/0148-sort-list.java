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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=findMid(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode leftList=sortList(head);
        ListNode rightList=sortList(right);
        return merge(leftList,rightList);
    }
    public ListNode merge(ListNode left, ListNode right){
        ListNode node=new ListNode(0);
        ListNode temp=node;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null) temp.next=left;
        if(right!=null) temp.next=right;
        return node.next;
    }
    public ListNode findMid(ListNode head){
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;    
        }
        return slow;
    }
}