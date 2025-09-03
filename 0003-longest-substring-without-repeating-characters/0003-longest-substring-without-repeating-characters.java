class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        int max=0;
        int st=0,la=0;
        char[] ch=s.toCharArray();
        List<Character> l=new ArrayList<>();
        while(st<=la && la<ch.length){
            if(!l.contains(ch[la])) {
                l.add(ch[la]);
                la+=1;
            }
            else{
                l.remove(0);
                st+=1;
            }
            max=Math.max(max,l.size());
        }
        return max;
    }
}