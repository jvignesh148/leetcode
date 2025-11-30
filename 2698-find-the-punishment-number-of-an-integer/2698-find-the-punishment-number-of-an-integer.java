class Solution {
    public int punishmentNumber(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            int num = i * i;
            if(dfs(String.valueOf(num), 0, i, 0)) result += num;
        }
        return result;
    }
    public boolean dfs(String s, int i, int target, int sum) {
        if(sum > target) return false;
        if(i == s.length()) return sum == target;
        int val = 0;
        for(int k = i; k < s.length(); k++) {
            val = val * 10 + ( s.charAt(k) - '0');
            if(dfs(s, k + 1, target, sum + val)) return true;
        }
        return false;
    }
}