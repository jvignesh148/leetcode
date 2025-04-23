class Solution {
    public int countLargestGroup(int n) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int m : map.values()) max=Math.max(m,max);
        for(int m : map.values()) if(m==max) count++;
        return count;
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}