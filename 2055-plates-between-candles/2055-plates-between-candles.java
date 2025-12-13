class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length(), m = queries.length;
        int[] result = new int[m];
        int ind = 0;
        int[] leftpres = new int[n];
        int[] rightpres = new int[n];
        int[] prefix = new int[n];
        prefix[0] = s.charAt(0) == '*' ? 1 : 0;
        leftpres[0] = s.charAt(0) == '|' ? 0 : -1;
        rightpres[n - 1] = s.charAt(n - 1) == '|' ? n - 1 : -1;
        for (int i = n - 2; i >= 0; i--) {
            rightpres[i] = s.charAt(i) == '|' ? i : rightpres[i + 1];
        }
        for(int i = 1; i < n; i++) {
            leftpres[i] = s.charAt(i) == '|' ? i : leftpres[i - 1];
            prefix[i] = prefix[i - 1] + (s.charAt(i) == '*' ? 1 : 0);
        }
        for(int[] arr : queries) {
            int left = arr[0], right = arr[1];
            int l = rightpres[left], r = leftpres[right];
            if(l != -1 && r != -1 && l < r) result[ind++] = prefix[r] - prefix[l];
            else result[ind++] = 0;
        }
        return result;
    }
}