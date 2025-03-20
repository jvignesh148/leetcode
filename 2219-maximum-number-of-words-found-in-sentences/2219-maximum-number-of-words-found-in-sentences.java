class Solution {
    public int mostWordsFound(String[] sentences) {
        List<Integer> l=new ArrayList<>();
        for(String s : sentences){
            String[] str=s.split(" ");
            l.add(str.length);
        }
        Collections.sort(l);
        return l.get(l.size()-1);
    }
}