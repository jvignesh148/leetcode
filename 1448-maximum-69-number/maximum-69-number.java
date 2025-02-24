class Solution {
    public int maximum69Number (int num) {
        int size=0;
        int temp=num;
        while(temp>0){
            size+=1;
            temp/=10;
        }
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=num%10;
            num/=10;
        }
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        int sum=0,ind=size-1;
        while(ind>=0){
            sum=(sum*10)+arr[ind];
            ind--;
        }
        return sum;
    }
}