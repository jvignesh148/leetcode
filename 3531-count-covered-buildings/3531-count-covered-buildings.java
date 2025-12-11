class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer, TreeSet<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> colMap = new HashMap<>();
        for(int[] arr : buildings) {
            int x = arr[0], y = arr[1];
            rowMap.putIfAbsent(x, new TreeSet<>());
            rowMap.get(x).add(y);
            colMap.putIfAbsent(y, new TreeSet<>());
            colMap.get(y).add(x);
        }
        int result = 0;
        for(int[] arr : buildings) {
            int x = arr[0], y = arr[1];
            TreeSet<Integer> row = rowMap.get(x);
            TreeSet<Integer> col = colMap.get(y);
            Integer rh = row.higher(y), rl = row.lower(y), ch = col.higher(x), cl = col.lower(x);
            if(rh != null && rl != null && ch !=null && cl != null) result++;
        }
        return result;
    }
}