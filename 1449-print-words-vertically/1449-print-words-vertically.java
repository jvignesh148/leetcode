class Solution {
    public List<String> printVertically(String s) {
        String[] arr=s.split(" ");
        List<String> l=new ArrayList<>();
        int ind=0;
        for(String word : arr) ind=Math.max(ind,word.length());
        for(int i=0;i<ind;i++){
            StringBuilder sb=new StringBuilder();
            for(String word : arr){
                if(i<word.length()) sb.append(word.charAt(i));
                else sb.append(" ");
            }
            int j=sb.length();
            while(j>0 && sb.charAt(j-1)==' ') j--;
            l.add(sb.substring(0,j));
        }
        return l;
    }
}