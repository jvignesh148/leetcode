class Solution {
    public int getWinner(int[] arr, int k) {
        int max = 0;
        for(int num : arr) max = Math.max(max,num);
        if(k >= arr.length) return max;
        if( k == 1) return Math.max(arr[0],arr[1]);
        int count = 0;
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(result > arr[i]) count++;
            else {
               result = Math.max(result, arr[i]);
               count = 1;
            }
            if(count == k) return result;
         }
        return result;
    }
}