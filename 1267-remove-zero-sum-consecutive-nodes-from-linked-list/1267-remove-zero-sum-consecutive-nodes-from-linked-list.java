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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode node=new ListNode(0);
        node.next=head;
        HashMap<Integer,ListNode> map=new HashMap<>();
        int prefix=0;
        ListNode dummy=node;
        while(dummy!=null){
            prefix+=dummy.val;
            map.put(prefix,dummy);
            dummy=dummy.next;
        }
        prefix=0;
        dummy=node;
        while(dummy!=null) {
            prefix+=dummy.val;
            dummy.next=map.get(prefix).next;
            dummy=dummy.next;
        }
        return node.next;
    }

}