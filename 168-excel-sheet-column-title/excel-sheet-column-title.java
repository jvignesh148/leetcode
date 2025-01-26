class Solution {
    public String convertToTitle(int columnNumber) {
        String st="";
        char[] c={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n=columnNumber;
        while(n>0){
            n--;
            int m=n%26;
            st=c[m]+st;
            n/=26;
        }
        return st;
    }
}