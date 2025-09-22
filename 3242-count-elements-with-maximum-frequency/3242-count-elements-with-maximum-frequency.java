class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        int max=0,count=0;
        for(int m : map.keySet()){
            if(map.get(m)==max){
                count+=map.get(m);
            }
            else if(map.get(m)>max){
                max=map.get(m);
                count=max;
            }
        }
        return count;
    }
}