class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String st="";
        for(char c : s.toCharArray()){
            if(c=='0') st+='1';
            else st+='0';
        }
        return Integer.parseInt(st,2);
    }
}