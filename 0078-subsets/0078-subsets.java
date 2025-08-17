class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        generate(nums.length,nums,new ArrayList<>(),0);
        return list;
    }
    public void generate(int n, int[] nums, List<Integer> emp, int k){
        if(k>=n){
            list.add(new ArrayList<>(emp));
            return;
        }
        emp.add(nums[k]);
        generate(n,nums,emp,k+1);
        emp.removeLast();
        generate(n,nums,emp,k+1);
    }
}