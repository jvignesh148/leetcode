class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i=0,x=0;
        while(i<operations.length){
            if(operations[i].equals("--X")) --x;
            else if(operations[i].equals("++X")) ++x;
            else if(operations[i].equals("X++")) x++;
            else x--;
            i+=1;
        }
        return x;

    }
}