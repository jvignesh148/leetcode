class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int num : costs){
            if(coins>=num) {
                count++;
                coins=coins-num;
            }
        }
        return count;
    }
}