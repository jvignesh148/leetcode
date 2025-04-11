class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : tasks) map.put(num,map.getOrDefault(num,0)+1);
        int count=0;
        for(int m : map.keySet()){
            if(map.get(m)==1) return -1;
            int k=map.get(m);
            while(k>=3){
                k-=3;
                count+=1;
                if(k==2) break;
                if(k==1){
                    k+=3;
                    count-=1;
                    break;
                }
            }
            count+=k/2;
        }
        return count;
    }
}