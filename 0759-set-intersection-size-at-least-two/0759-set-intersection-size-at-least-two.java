class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        int a = -1, b = -1;
        int result = 0;
        for(int[] arr : intervals) {
            int t1 = arr[0], t2 = arr[1];
            if(t1 > b) {
                result += 2;
                a = t2 - 1;
                b = t2;
            }
            else if(t1 > a) {
                result += 1;
                a = b;
                b = t2;
            }
        }
        return result;
    }
}