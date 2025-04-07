class Solution {
    public List<String> cellsInRange(String s) {
        List<String> l=new ArrayList<>();
        char c=s.charAt(0);
        int n=Integer.parseInt(String.valueOf(s.charAt(1)));
        int m=Integer.parseInt(String.valueOf(s.charAt(4)));
        while(c<=s.charAt(3)){
            for(int i=n;i<=m;i++){
                String st=c+String.valueOf(i);
                l.add(st);
            }
            c+=1;
        }
        return l;
    }
}