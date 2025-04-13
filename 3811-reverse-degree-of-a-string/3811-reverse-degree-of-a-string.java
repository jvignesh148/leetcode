class Solution {
    public int reverseDegree(String s) {
        String str="zyxwvutsrqponmlkjihgfedcba";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(i+1)*(str.indexOf(s.charAt(i))+1);
        }
        return sum;
    }
}