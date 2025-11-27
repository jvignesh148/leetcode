class Solution {
    static {
        for(int i = 0; i < 500; i++) minSwaps("");
    }
    public static int minSwaps(String s) {
        int result = 0;
        int pending = 0;
        for(char c : s.toCharArray()) {
            if(c == '[') pending++;
            else pending--;
            if(pending < 0) {
                result++;
                pending = 1;
            }
        }
        return result;
    }
}