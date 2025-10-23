class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            s=check(s);
        }
        return s.charAt(0)==s.charAt(1);
    }
    public String check(String s){
        if(s.length()<=2) return s;
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<arr.length;i++){
            int n1=arr[i-1]-'0';
            int n2=arr[i]-'0';
            int res=(n1+n2)%10;
            sb.append((char) (res+'0'));
        }
        return sb.toString();
    }
}