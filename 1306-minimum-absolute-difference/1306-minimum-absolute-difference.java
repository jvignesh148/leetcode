class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int maxmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i+1]-arr[i];
            maxmin=Math.min(min,maxmin);
        }
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==maxmin){
                l.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return l;
    }
}