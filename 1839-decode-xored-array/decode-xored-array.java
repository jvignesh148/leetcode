class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        int ind=1;
        for(int i=0;i<encoded.length;i++){
            arr[ind]=arr[ind-1]^encoded[i];
            ind+=1;
        }
        return arr;    }
}