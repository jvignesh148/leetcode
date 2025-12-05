class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        for(String s : queries) {
            for(String s1 : dictionary) {
                int count = 0;
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) != s1.charAt(i)) count++;
                    if(count > 2) break; 
                }
                if(count <= 2) {
                    list.add(s);
                    break;
                }
            }
        }
        return list;
    }
}