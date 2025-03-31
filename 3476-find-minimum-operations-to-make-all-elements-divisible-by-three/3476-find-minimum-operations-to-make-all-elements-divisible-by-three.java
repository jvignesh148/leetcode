class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int num : nums){
            while(num%3!=0){
                if((num+1)%3==0) {count+=1;break;}
                else if((num-1)%3==0) {count+=1;break;}
                else num+=1;
            }
        }
        return count;
    }
}