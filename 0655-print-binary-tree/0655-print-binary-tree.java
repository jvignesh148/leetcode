/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<String>> list=new ArrayList<>();
    int treeHeight=0;
    public List<List<String>> printTree(TreeNode root) {
        treeHeight=height(root);
        int width=(int) Math.pow(2,treeHeight+1)-1;
        for(int i=0;i<=treeHeight;i++) list.add(new ArrayList<>());
        for(List<String> l : list){
            for(int i=0;i<width;i++) l.add("");
        }
        dfs(root,0,(width-1)/2);
        return list;
    }
    public int height(TreeNode node){
        if(node==null) return -1;
        return 1+Math.max(height(node.left),height(node.right));
    }
    public void dfs(TreeNode node,int i, int j){
        if(node==null) return;
        list.get(i).set(j,String.valueOf(node.val));
        int k=(i == treeHeight) ? 0 : (int) Math.pow(2,treeHeight-i-1);
        dfs(node.left,i+1,j-k);
        dfs(node.right,i+1,j+k);
    }
}