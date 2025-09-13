class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        for(char c : s.toCharArray()){
            if("[AEIOUaeiou]".contains(String.valueOf(c))) m1.put(c,m1.getOrDefault(c,0)+1);
            else m2.put(c,m2.getOrDefault(c,0)+1);
        }
        int max1=0,max2=0;
        for(char c : m1.keySet()){
            max1=Math.max(max1,m1.get(c));
        }
        for(char c : m2.keySet()){
            max2=Math.max(max2,m2.get(c));
        }
        return max1+max2;
    }
}