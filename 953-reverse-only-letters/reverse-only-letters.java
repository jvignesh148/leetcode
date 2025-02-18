class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c=s.toCharArray();
        int st=0,la=c.length-1;
        while(st<la){
            if((c[st]>='a' && c[st]<='z') || (c[st]>='A' && (c[st]<='Z'))){
                if((c[la]>='a' && c[la]<='z') || (c[la]>='A' && (c[la]<='Z'))){
                    char temp=c[st];
                    c[st]=c[la];
                    c[la]=temp;
                    la-=1;
                    st+=1;
                }
                else la-=1;
            }
            else st+=1;
        }
        String str="";
        for(int i=0;i<c.length;i++){
            str+=c[i];
        }
        return str;
    }
}