class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				l.add(matrix[top][i]);
			}
			top+=1;
			for(int i=top;i<=bottom;i++) {
				l.add(matrix[i][right]);
			}
			right-=1;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    l.add(matrix[bottom][i]);
                }
                bottom-=1;	
            }	
            if(left<=right) {	
                for(int i=bottom;i>=top;i--) {
                    l.add(matrix[i][left]);
                }
                left+=1;
            }
			
		}
		return l;
    }
}