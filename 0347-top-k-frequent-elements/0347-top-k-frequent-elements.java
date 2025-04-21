class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[] = new int[k];
        int index =0;
        while(true){
            int max =0;
            int val =0;
            for(int i:map.keySet()){
                if(map.get(i)>max) {
                    max = map.get(i);
                    val = i;
                }
            }
            arr[index++] = val;
            if(index==k) break;
            map.remove(val);
        }
        return arr;
    }
}