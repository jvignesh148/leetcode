class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int numCols = strs[0].length();

        for (int col = 0; col < numCols; col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row - 1].charAt(col) > strs[row].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
