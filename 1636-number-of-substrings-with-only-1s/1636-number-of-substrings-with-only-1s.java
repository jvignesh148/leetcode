class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long result = 0;
        long count = 0; 
        for(char c : s.toCharArray()) {
            if(c == '1' ) count++;
            else {
                result += (((count + 1) * count) / 2 )  % mod;
                count = 0;
            }
        }
        result += (((count + 1) * count) / 2 )  % mod;
        return (int) result;
    }
}