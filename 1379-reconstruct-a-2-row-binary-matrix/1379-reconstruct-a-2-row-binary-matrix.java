class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> list =  new ArrayList<>();
        int sum = 0, two=0;
        for(int num : colsum) {
            sum+=num;
            if(num==2) two++;
        }
        if(sum != (upper + lower) || two > lower || two > upper) return new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for(int i = 0; i < colsum.length; i++) {
            if( colsum[i] == 2 && upper > 0 && lower > 0){
                list.get(0).add(1);
                list.get(1).add(1);
                upper--;
                lower--;
            }
            else if ( colsum[i] == 0 ) {
                list.get(0).add(0);
                list.get(1).add(0);
            }
            else {
                if(upper >= lower && upper > 0){
                    list.get(0).add(1);
                    list.get(1).add(0);
                    upper--;
                }
                else if(lower > 0){ 
                    list.get(1).add(1);
                    list.get(0).add(0);
                    lower--;
                }
                else {
                    return new ArrayList<>();
                }
            }
        }
        return list;
    }
}