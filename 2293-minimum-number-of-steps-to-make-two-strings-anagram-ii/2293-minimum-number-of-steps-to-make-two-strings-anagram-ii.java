class Solution {
    public int minSteps(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char c : t.toCharArray()) arr2[c-'a']++;
        for(char c : s.toCharArray()) arr1[c-'a']++;
        if(Arrays.equals(arr1,arr2)) return 0;
        int result=0;
        for(int i=0;i<26;i++) if(arr1[i]!=arr2[i]) result+=Math.abs(arr2[i]-arr1[i]);
        return result;
    }
}