class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        for(int i=1;i<n;i++){
            int a=i,b=n-i;
            if(!containsZero(a) && !containsZero(b)) {
                arr[0]=a;
                arr[1]=b;
                return arr;
            }
        }
        return arr;
    }
    public static boolean containsZero(int n){
        while(n>0){
            if(n%10==0) return true;
            n/=10;
        }
        return false;
    }
}