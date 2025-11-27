class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++) {
            int num=groupSizes[i];
            map.putIfAbsent(num,new ArrayList<>());
            map.get(num).add(i);
        }
        for(int num : map.keySet()) {
            int ind = 0;
            List<Integer> l = new ArrayList<>();
            for(int val : map.get(num)) {
                if(ind < num ) {
                    l.add(val);
                    ind++;
                }
                else {
                    list.add(l);
                    l = new ArrayList<>();
                    l.add(val);
                    ind = 1;
                }
            }
            list.add(l);
        }
        return list;
    }
}