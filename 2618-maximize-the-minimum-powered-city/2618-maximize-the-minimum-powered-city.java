class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long l = 0, h = 0;
        for (int x : stations) h += x + k;
        long ans = 0;
        while (l <= h) {
            long mid = (l + h) / 2;
            if (check(stations, r, k, mid)) {
                ans = mid;
                l = mid + 1;
            } else h = mid - 1;
        }
        return ans;
    }
    boolean check(int[] stations, int r, long k, long mid) {
        int n = stations.length;
        long[] add = new long[n];
        long curr = 0, used = 0;
        for (int i = 0; i <= r && i < n; i++) curr += stations[i];
        for (int i = 0; i < n; i++) {
            if (i - r - 1 >= 0) curr -= stations[i - r - 1] + add[i - r - 1];
            if (i + r < n && i + r > 0 && i > 0) curr += stations[i + r] + add[i + r];
            if (curr < mid) {
                long need = mid - curr;
                used += need;
                if (used > k) return false;
                int pos = Math.min(n - 1, i + r);
                add[pos] += need;
                curr += need;
            }
        }
        return true;
    }
}
