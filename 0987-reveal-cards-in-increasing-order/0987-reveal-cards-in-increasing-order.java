class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=deck.length-1;i>=0;i--){
            dq.addFirst(deck[i]);
            if(i>0){
                int temp=dq.removeLast();
                dq.addFirst(temp);
            }
        }
        for(int i=0;i<deck.length;i++){
            deck[i]=dq.removeFirst();
        }
        return deck;
    }
}