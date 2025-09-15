class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> path = new LinkedList<>();
        int level = (int)(Math.log(label) / Math.log(2)) + 1;
        while (label > 0) {
            path.addFirst(label);
            int levelStart = 1 << (level - 1);
            int levelEnd = (1 << level) - 1; 
            label = (levelStart + levelEnd - label) / 2;
            level--;
        }
        return path;
    }
}