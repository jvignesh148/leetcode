class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] parts1 = num1.split("\\+|i");
        int a = Integer.parseInt(parts1[0]);
        int b = Integer.parseInt(parts1[1]);
        String[] parts2 = num2.split("\\+|i");
        int c = Integer.parseInt(parts2[0]);
        int d = Integer.parseInt(parts2[1]);
        int realPart = a * c - b * d;
        int imaginaryPart = a * d + b * c;
        return realPart + "+" + imaginaryPart + "i";
    }
}