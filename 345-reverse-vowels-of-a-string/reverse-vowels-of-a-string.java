class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        String regex="[aeiouAEIOU]";
        String sat="";
        int st=0,la=c.length-1;
        while(st<=la){
            if(!regex.contains(String.valueOf(c[st]))) st+=1;
            else if(!regex.contains(String.valueOf(c[la]))) la-=1;
            else{
                char temp=c[st];
                c[st]=c[la];
                c[la]=temp;
                st+=1;
                la-=1;
            }
        }
        for(int i=0;i<c.length;i++){
            sat+=c[i];
        }
        return sat;
    }
}