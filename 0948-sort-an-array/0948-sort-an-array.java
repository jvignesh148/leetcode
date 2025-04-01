class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,nums.length);
        return nums;
    }
    public static void mergesort(int[] arr,int n){
        if(n<2) return;
        int mid=n/2;
        int[] left=new int[mid];
        int[] right=new int[n-mid];
        for(int i=0;i<mid;i++) left[i]=arr[i];
        for(int i=mid;i<n;i++) right[i-mid]=arr[i];
        mergesort(left,mid);
        mergesort(right,n-mid);
        merge(arr,left,right,mid,n-mid);
    }
    public static void merge(int[] arr, int[] left, int[] right,int mid, int rem){
        int i=0,j=0,k=0;
        while(i < mid && j < rem){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else arr[k++]=right[j++];
        }
        while(i<mid) arr[k++]=left[i++]; 
        while(j<rem) arr[k++]=right[j++]; 
    }
}