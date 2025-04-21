class Solution {
    public int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=lo;i<=hi;i++) map.put(i,power(i));
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue();
            } else {
                return a.getKey() - b.getKey();
            }
        });
        return list.get(k - 1).getKey();
    }
    public static int power(int n){
        int count=0;
        while(n>1){
            count++;
            if(n%2==0) n/=2;
            else n=3*n+1;
        }
        return count;
    }
}