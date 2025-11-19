class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=i+1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for( int m: map.keySet()){
            if(map.get(m)<2) l.add(m);
        }
        return l;
    }
}