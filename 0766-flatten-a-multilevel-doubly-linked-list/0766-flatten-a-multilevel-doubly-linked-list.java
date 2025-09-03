/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    Node node=new Node(0);
    Node dummy=node.next;
    public Node flatten(Node head) {
        if(head==null) return null;
        helper(head);
        return head;
    }
    public Node helper(Node curr){
        Node node=curr;
        Node tail=curr;
        while(node!=null){
            Node next=node.next;
            if(node.child!=null){
                Node childHead=node.child;
                Node childTail=helper(childHead);
                node.child=null;
                childHead.prev=node;
                node.next=childHead;
                if (next!=null) {
                    childTail.next=next;
                    next.prev=childTail;
                }
                node.child=null;
                tail=childTail;
            }
            else{
                tail=node;
            }
            node=next;
        }
        return tail;
    }
}