class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed,(a,b) -> {
            int A=Integer.bitCount(a);
            int B=Integer.bitCount(b);
            if(A==B) return Integer.compare(a,b);
            else return Integer.compare(A,B);
        });
        return Arrays.stream(boxed).mapToInt(i -> i).toArray();
    }
}