class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums=new int[n][n];
        int k=1;
        int left=0,right=nums[0].length-1,top=0,bottom=nums.length-1;
        while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				nums[top][i]=k;
                k+=1;
			}
			top+=1;
			for(int i=top;i<=bottom;i++) {
				nums[i][right]=k;
                k+=1;
			}
			right-=1;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    nums[bottom][i]=k;
                    k+=1;
                }
                bottom-=1;	
            }	
            if(left<=right) {	
                for(int i=bottom;i>=top;i--) {
                    nums[i][left]=k;
                    k+=1;
                }
                left+=1;
            }
		}
        return nums;
    }
}