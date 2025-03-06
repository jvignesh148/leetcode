class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=(int) Math.pow(grid.length,2);
        int sum=m*(m+1)/2;
        int s1=0,ind=0;
        int[] result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(!map.containsValue(grid[i][j])){
                    map.put(ind,grid[i][j]);
                    ind+=1;
                    s1+=grid[i][j];
                }
                else{
                    result[0]=grid[i][j];
                }
            }
        }
        result[1]=sum-s1;
        return result;
    }
}