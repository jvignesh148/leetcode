class AuthenticationManager {
    class Node{
        String token;
        int expire;
        Node prev;
        Node next;
        Node(String token, int expire){
            this.token=token;
            this.expire=expire;
        }
    }
    HashMap<String,Node> map=new HashMap<>();
    private int timeToLive;
    private Node head,tail;
    public AuthenticationManager(int timeToLive) {
        this.timeToLive=timeToLive;
        this.head=new Node("",-1);
        this.tail=new Node("",-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public void generate(String tokenId, int currentTime) {
        Node node=new Node(tokenId,(currentTime+timeToLive));
        addNode(node);
        map.put(tokenId,node);
    }
    
    public void renew(String tokenId, int currentTime) {
        Node curr=map.get(tokenId);
        if(curr==null || curr.expire<=currentTime) return;
        remove(curr);
        curr.expire=(currentTime+timeToLive);
        addNode(curr);
    }
    
    public int countUnexpiredTokens(int currentTime) {
        Node temp=head.next;
        while(temp!=tail && temp.expire<=currentTime){
            map.remove(temp.token);
            Node curr=temp.next;
            remove(temp);
            temp=curr;            
        }
        return map.size();
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void addNode(Node node){
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */