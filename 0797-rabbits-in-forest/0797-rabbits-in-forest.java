class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : answers) map.put(num,map.getOrDefault(num,0)+1);
        int c=0;
        for(int m : map.keySet()){
            int g=m+1;
            int res=(map.get(m)+g-1)/g;
            c+=(res*g);
        }
        return c;
    }
}