class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for( int i = left; i <= right; i++){
            if(isDivisible(i)) list.add(i);
        }
        return list;
    }
    public boolean isDivisible(int n){
        int temp = n;
        while(temp > 0){
            int k=temp % 10;
            if(k == 0) return false;
            if(n % k != 0) return false;
            temp /= 10;
        }
        return true;
    }
}