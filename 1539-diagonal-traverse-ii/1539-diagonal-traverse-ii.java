class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int count=0,maxKey=0;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                int key=i+j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(nums.get(i).get(j));
                count++;
                maxKey=Math.max(maxKey,key);
            }
        }
        int[] result=new int[count];
        int ind=0;
        for(int i=0;i<=maxKey;i++){
            List<Integer> list=map.get(i);
            if(list==null) continue;
            for(int j=list.size()-1;j>=0;j--) result[ind++]=list.get(j);
        }
        return result;
    }
}