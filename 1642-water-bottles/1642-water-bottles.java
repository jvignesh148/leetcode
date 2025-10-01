class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result=numBottles,temp=numBottles;
        while(temp>=numExchange){
            int t=temp/numExchange;
            result+=t;
            temp=temp%numExchange+t;
        }
        return result;
    }
}