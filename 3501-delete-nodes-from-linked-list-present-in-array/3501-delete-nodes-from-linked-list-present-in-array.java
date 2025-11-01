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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode list=new ListNode(0);
        ListNode temp=head,dummy=list;
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums) set.add(i);
        while(temp!=null){
            if(!set.contains(temp.val)) {
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        return list.next;
    }
}