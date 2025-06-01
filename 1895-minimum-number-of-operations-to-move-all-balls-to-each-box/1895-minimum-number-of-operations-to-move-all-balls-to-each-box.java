class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int count = 0;       
        int c1 = 0;  
        for (int i = 0; i < boxes.length(); i++) {
            ans[i] += c1;
            if (boxes.charAt(i) == '1') count++;
            c1 += count;
        }
        count = 0;
        c1 = 0;
        for (int i = boxes.length() - 1; i >= 0; i--) {
            ans[i] += c1;
            if (boxes.charAt(i) == '1') count++;
            c1 += count;
        }
        return ans;
    }
}