class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i : spaces){
            sb.append(s.substring(j,i));
            j=i;
            sb.append(" ");
        }
        sb.append(s.substring(spaces[spaces.length-1]));
        return sb.toString();
    }
}