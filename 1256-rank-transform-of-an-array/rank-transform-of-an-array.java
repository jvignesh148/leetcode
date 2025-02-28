class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ind=1;
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],ind);
                ind+=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=map.get(nums[i]);
        }
        return nums;
    }
}