class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        HashSet<Integer> val=new HashSet<>();
        for(int num : nums1){
            if(!val.contains(num)) val.add(num);
        }
        for(int num : nums2){
            if(val.contains(num) && !l.contains(num)) l.add(num);
        }
        int[] n=new int[l.size()];
        for(int i=0;i<l.size();i++) n[i]=l.get(i);
        return n;
    }
}