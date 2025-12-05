class Solution {
    public int maxDistinct(String s) {
        int[] arr = new int[26];
        int count = 0;
        for(char c : s.toCharArray()) {
            arr[c - 'a']++;
            if(arr[c - 'a'] == 1) count++;
        }
        return count;
    }
}