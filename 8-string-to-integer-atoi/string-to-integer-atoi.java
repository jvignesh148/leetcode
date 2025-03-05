class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()<1) return 0;
        int sign=1;
        if(s.charAt(0)=='-' || s.charAt(0)=='+') {
            sign=s.charAt(0)=='-'?-1:1;
            s=s.substring(1);
        }
        long ans=0;
        int i=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            ans=(ans*10)+s.charAt(i)-'0';
            if(ans*sign<Integer.MIN_VALUE ) return Integer.MIN_VALUE;
            else if(ans*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i+=1;
        }
        return (int) ans*sign;
    }
}