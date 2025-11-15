class Solution {
    public int numberOfSubstrings(String s, int k) {
        int result = 0;
        int[] arr;
        for( int i = 0; i < s.length(); i++) {
            arr = new int[26];
            for(int j = i ; j < s.length(); j++) {
                char c = s.charAt(j);
                arr[c-'a']++;
                if(arr[c-'a'] == k) {
                    result+= s.length() - j;
                    break;
                }
            }
        }
        return result;
    }
}