class Solution {
    public String originalDigits(String s) {
        String str="";
        int[] arr = new int[26];
        for(char c : s.toCharArray()) arr[c-'a']++;
        while(arr[25]!=0) {
            str+='0';
            arr[4]--;
            arr[17]--;
            arr[14]--;
            arr[25]--;
        }
        while(arr[22]!=0){
            str+='2';
            arr[14]--;
            arr[19]--;
            arr[22]--;
        }
        while(arr[20]!=0){
            str+='4';
            arr[17]--;
            arr[20]--;
            arr[5]--;
            arr[14]--;
        }
        while(arr[23]!=0) {
            str+='6';
            arr[18]--;
            arr[8]--;
            arr[23]--;
        }
        while(arr[6]!=0) {
            str+='8';
            arr[4]--;
            arr[8]--;
            arr[6]--;
            arr[7]--;
            arr[19]--;
        }
        while(arr[14]!=0) {
            str+='1';
            arr[14]--;
            arr[13]--;
            arr[4]--;
        }
        while(arr[19]!=0) {
            str+='3';
            arr[19]--;
            arr[7]--;
            arr[17]--;
            arr[4]-=2;
        }
        while(arr[5]!=0){
            str+='5';
            arr[21]--;
            arr[5]--;
            arr[8]--;
            arr[4]--;
        }
        while(arr[21]!=0){
            str+='7';
            arr[21]--;
            arr[18]--;
            arr[13]--;
            arr[4]-=2;
        }
        while(arr[8]!=0) {
            str+='9';
            arr[4]--;
            arr[13]-=2;
            arr[8]--;
        }
        char[] nums = str.toCharArray();
        Arrays.sort(nums);
        return new String(nums);
    }
}