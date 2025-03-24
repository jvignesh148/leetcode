class Solution {
    public String reverseStr(String s, int k) {
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i+=2*k){
            int st=i;
            int la=Math.min(i+k-1,s.length()-1);
            while(st<=la){
                char temp=str[st];
                str[st]=str[la];
                str[la]=temp;
                st+=1;
                la-=1;
            }
        }
        return String.valueOf(str);
    }
}