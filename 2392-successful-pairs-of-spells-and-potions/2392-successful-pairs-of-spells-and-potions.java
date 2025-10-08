class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result=new int[spells.length];
        Arrays.sort(potions);
        int ind=0;
        for(int i : spells){
            int st=0,la=potions.length-1,c=0;
            while(st<=la){
                int m=st+(la-st)/2;
                long res=(long) i * (long) potions[m];
                if(res>=success) la=m-1;
                else st=m+1;
            }
            result[ind++]=potions.length-st;
        }
        return result;
    }
}