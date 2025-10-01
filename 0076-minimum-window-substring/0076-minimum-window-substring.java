class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> check=new HashMap<>();
        for(char c : t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int left=0,right=0,valid=0;
        int start=0,len=Integer.MAX_VALUE;
        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            if(map.containsKey(c)){
                check.put(c,check.getOrDefault(c,0)+1);
                if(check.get(c).intValue()==map.get(c).intValue()) valid++;
            }
            while(valid==map.size()){
                if(right-left<len){
                    start=left;
                    len=right-left;
                }
                char ch=s.charAt(left);
                left++;
                if(map.containsKey(ch)){
                    if(check.get(ch).intValue()==map.get(ch).intValue()) valid--;
                    check.put(ch,check.get(ch)-1);
                }
            }
        }
        return len==Integer.MAX_VALUE ? "" : s.substring(start,start+len);
    }
}