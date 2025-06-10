class Solution {
    public int maxDifference(String s) {
        int[] let=new int[27];
        int min=s.length(),max=Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
            let[c-'a']+=1;
        }
        for(int j:let){
            if(j%2!=0){
                max= Math.max(max,j);
            }
            if(j%2==0 && j!=0){
                min= Math.min(min,j);
            }
        }
        return max-min;
    }
}