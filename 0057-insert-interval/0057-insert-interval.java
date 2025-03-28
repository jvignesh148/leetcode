class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> l=new ArrayList<>();
        //int t1=0,t2=0;
        for(int[] arr : intervals){
            if(arr[1]<newInterval[0] || arr[0]>newInterval[1]) l.add(arr);
            else{
                newInterval[0]=Math.min(newInterval[0],arr[0]);
                newInterval[1]=Math.max(newInterval[1],arr[1]);
                //l.add(newInterval);
                //while(arr[0]<=newInterval[1]) i+=1;
            }
        }
    
        l.add(newInterval);
        l.sort(Comparator.comparingInt(arr -> arr[0]));
        int[][] nums=new int[l.size()][2];
        nums=l.toArray(nums);
        return nums;
    }
}