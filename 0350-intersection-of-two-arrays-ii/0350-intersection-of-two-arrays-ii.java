class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        List<Integer> l3=new ArrayList<>();
        for(int num : nums1) l1.add(num);
        for(int num : nums2) l2.add(num);
        for(int m : l2){
            if(l1.contains(m)){
                l3.add(m);
                l1.remove((Integer) m);
            }
        }
        int[] arr=new int[l3.size()];
        for(int i=0;i<arr.length;i++) arr[i]=l3.get(i);
        return arr;
    }
}