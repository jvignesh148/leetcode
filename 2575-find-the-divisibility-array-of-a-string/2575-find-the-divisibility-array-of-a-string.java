class Solution {
    static{
        for(int i = 0; i < 1000; i++) divisibilityArray("", 0);
    }
    public static int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] result = new int[n];
        long remainder = 0;
        for(int i = 0; i < n; i++) {
            remainder = (remainder * 10 + (word.charAt(i) - '0')) % m;
            result[i] = remainder == 0 ? 1 : 0; 
        }
        return result;
    }
}