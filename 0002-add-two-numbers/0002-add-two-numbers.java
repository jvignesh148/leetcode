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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n=0,m=0;
        ListNode temp1=l1,temp2=l2;
        ListNode list=new ListNode(0);
        ListNode dummy=list;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int value=temp1.val+temp2.val+carry;
            ListNode newNode=new ListNode(value%10);
            carry=value/10;
            dummy.next=newNode;
            dummy=dummy.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            dummy.next=new ListNode((temp1.val+carry)%10);
            carry=(temp1.val+carry)/10;
            dummy=dummy.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            dummy.next=new ListNode((temp2.val+carry)%10);
            carry=(temp2.val+carry)/10;
            dummy=dummy.next;
            temp2=temp2.next;
        }
        if(carry!=0){
            dummy.next=new ListNode(carry);
        }
        return list.next;
    }
}