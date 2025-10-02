class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int result=numBottles,temp=numBottles;
        while(temp>=numExchange){
            temp-=numExchange;
            numExchange++;
            temp++;
            result++;
        }
        return result;
    }
}