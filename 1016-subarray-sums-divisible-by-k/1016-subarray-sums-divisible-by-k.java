class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0,sum=0;
        map.put(0,1);
        for(int num : nums){
            sum+=num;
            int m=((sum%k)+k)%k;
            count+=map.getOrDefault(m,0);
            map.put(m,map.getOrDefault(m,0)+1);
        }
        return count;
    }
}