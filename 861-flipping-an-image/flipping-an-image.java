class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int n=0;
            int m=image[i].length-1;
            while(n<=m){
                int temp=image[i][n];
                image[i][n]=image[i][m];
                image[i][m]=temp;
                n+=1;
                m-=1;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}