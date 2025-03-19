class Solution {
    public String convertDateToBinary(String date) {
        String st="";
        st=Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
        st+="-";
        st+=Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
        st+="-";
        st+=Integer.toBinaryString(Integer.parseInt(date.substring(8)));
        return st;
    }
}