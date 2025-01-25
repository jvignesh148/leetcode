class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] m=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            m[i]=sum;
        }
        Arrays.sort(m);
        return m[m.length-1];
    }
}