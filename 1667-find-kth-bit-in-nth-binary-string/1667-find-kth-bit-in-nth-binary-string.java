class Solution {
    public char findKthBit(int n, int k) {
        String s="0";
        for(int i=0;i<n;i++){
            String temp=s+"1"+reverse(invert(s));
            s=temp;
        }
        return s.charAt(k-1);
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String invert(String s){
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c=='0' ? '1' : '0');
        }
        return sb.toString();
    }
}