class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            /*int count=0,a=i;
            while(a>0){
                a=a&(a-1);
                count+=1;
            }
            arr[i]=count;*/
            arr[i]=Integer.bitCount(i);
        }
        return arr;
    }
}