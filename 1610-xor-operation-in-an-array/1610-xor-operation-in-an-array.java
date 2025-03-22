class Solution {
    public int xorOperation(int n, int start) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(start+(2*i));
        }
        int k=l.get(0);
        for(int i=0;i<n-1;i++){
            k^=l.get(i+1);
        }
        return k;
    }
}