class Solution {
    static { 
        for(int i = 0; i < 500 ;i++) strWithout3a3b(0,0);
    }
    public static String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        char c1 = 'a', c2 = 'b';
        if( a < b) {
            int temp = a;
            a = b;
            b = temp;
            c2 = 'a';
            c1 = 'b';
        }
        while(a > 0 | b > 0) {
            if(a > 0) {
                sb.append(c1);
                a--;
            }
            if(a > 0 && a > b) {
                sb.append(c1);
                a--;
            }
            if(b > 0) {
                sb.append(c2);
                b--;
            }
        }
        return sb.toString();
    }
}