class Solution {
    int[] nums;
    int[] arr;
    Random rand;
    public Solution(int[] nums) {
        this.nums=nums;
        rand=new Random();
        arr=nums.clone();
    }
    
    public int[] reset() {
        nums=arr.clone();
        return nums;
    }
    
    public int[] shuffle() {
        int[] result=nums.clone();
        for(int i=result.length-1;i>=0;i--){
            int index=rand.nextInt(i+1);
            int temp=result[i];
            result[i]=result[index];
            result[index]=temp;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */