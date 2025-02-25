class Solution {
    public int dayOfYear(String date) {
        int m=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8,date.length()));
        int year=Integer.parseInt(date.substring(0,4));
        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            arr[1]=29;
        }
        else{
            arr[1]=28;
        }
        arr[m-1]=d;
        for(int i=0;i<m;i++){
            sum+=arr[i];
        }
        return sum;
    }
}