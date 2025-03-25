class Solution {
    public int repeatedStringMatch(String a, String b) {
        String str="";
        int count=0;
        while(str.length() < b.length()){
            str+=a;
            count+=1;
        }
        if(str.contains(b)) return count;
        str+=a;
        count+=1;
        if(str.contains(b)) return count;
        return -1;
    }
}