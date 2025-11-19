class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l=new ArrayList<>();
        int ind=0;
        for(int i=1;i<=n;i++){
            if(ind<target.length && i==target[ind]) {
                l.add("Push");
                ind++;
            }
            else {
                l.add("Push");
                l.add("Pop");
            }
            if(ind==target.length) break;
        }
        return l;
    }
}