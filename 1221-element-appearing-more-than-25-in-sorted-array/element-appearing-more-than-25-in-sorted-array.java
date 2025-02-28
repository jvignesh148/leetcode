class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max=0,k=0;
        for(int m : map.keySet()){
            if(max<map.get(m)) {
                max=map.get(m);
                k=m;
            }
        }
        return k;
    }
}