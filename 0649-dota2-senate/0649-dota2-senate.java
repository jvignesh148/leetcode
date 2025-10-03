class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') q2.offer(i);
            else q1.offer(i);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            int r=q2.poll(),d=q1.poll();
            if(r<d) q2.offer(r+senate.length());
            else q1.offer(r+senate.length());
        }
        return q2.isEmpty() ? "Dire" : "Radiant";
    }
}