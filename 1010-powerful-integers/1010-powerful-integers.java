class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<32;i++){
            for(int j=0;j<32;j++){
                int ans=(int) Math.pow(x,i)+(int) Math.pow(y,j);
                if(ans>=0 && ans<=bound && !l.contains(ans)) l.add(ans);
            }
        }
        return l;
    }
}