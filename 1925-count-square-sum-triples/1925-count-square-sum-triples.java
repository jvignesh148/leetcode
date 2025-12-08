class Solution {
    public int countTriples(int n) {
        int res = 0;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (((i - j) & 1) == 0 || gcd(i, j) != 1) continue;
                int c = i * i + j * j;
                if (c > n) continue;
                res += 2 * (n / c);
            }
        }
        return res;
    }
    int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}