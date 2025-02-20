class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] c=new int[candies.length];
        for(int i=0;i<candies.length;i++) c[i]=candies[i];
        Arrays.sort(c);
        List<Boolean> l=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=c[c.length-1]) l.add(true);
            else l.add(false);
        }
        return l;
    }
}