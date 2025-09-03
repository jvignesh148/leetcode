class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int j=0,ind=0;
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<numRows;i++) list.add(new StringBuilder());
        while(j<s.length()){
            boolean flag=false;
            while(ind<numRows && j<s.length()){
                list.get(ind).append(s.charAt(j));
                flag=true;
                j++;
                ind++;
            }
            ind--;
            while(flag && ind>0 && j<s.length()){
                list.get(--ind).append(s.charAt(j));
                j++;
            }
            ind++;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb : list) {
            res.append(sb);
        }
        return res.toString();
    }
}