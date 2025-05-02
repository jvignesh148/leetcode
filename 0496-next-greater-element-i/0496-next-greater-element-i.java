class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j=0,ind=0;
        int[] arr=new int[nums1.length];
        while(j<nums1.length){
            boolean flag=true;
            for(int i=0;i<nums2.length;i++){
                if(nums2[i]==nums1[j]) flag=false;
                if(nums2[i]>nums1[j] && !flag) {
                    arr[ind]=nums2[i];
                    break;
                }
                else arr[ind]=-1;
            }
            ind++;
            j++;
        }
        return arr;
    }
}