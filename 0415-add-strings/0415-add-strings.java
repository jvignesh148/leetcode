import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bignum1 = new BigInteger(num1);
        BigInteger bignum2 = new BigInteger(num2);
        return String.valueOf(bignum1.add(bignum2));
    }
}