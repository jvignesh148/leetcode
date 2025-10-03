class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr1=new int[26];
        for(char c : s1.toCharArray()) arr1[c-'a']++;
        int[] arr2=new int[26];
        for(int i=0;i<s1.length();i++){
            arr2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)) return true;
        for(int i=s1.length();i<s2.length();i++){
            arr2[s2.charAt(i-s1.length())-'a']--;
            arr2[s2.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)) return true;
        }
        return false;
    }
}