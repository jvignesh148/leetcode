class Solution {
    public String strWithout3a3b(int a, int b) {
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