class Solution {
    public int minLengthAfterRemovals(String s) {
        int c1 = 0, c2 = 0;
        char[] arr = s.toCharArray();
        for(char c : arr) {
            if(c == 'a') c1++;
            else c2++;
        }
        return Math.abs(c1 - c2);
    }
}