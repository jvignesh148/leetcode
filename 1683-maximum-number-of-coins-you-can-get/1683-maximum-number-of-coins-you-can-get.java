class Solution {
    public int maxCoins(int[] piles) {
        Integer[] arr=new Integer[piles.length];
        for(int i=0;i<piles.length;i++) arr[i]=piles[i];
        Arrays.sort(arr,Comparator.reverseOrder());
        int sum=0;
        for(int i=0;i<(piles.length/3);i++){
            sum+=arr[2*i+1];
        }
        return sum;
    }
}