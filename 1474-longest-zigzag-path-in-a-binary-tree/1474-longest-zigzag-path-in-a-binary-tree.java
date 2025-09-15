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
    int maxZigZag=0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left,1,false);
        dfs(root.right,1,true);
        return maxZigZag;
    }
    public void dfs(TreeNode node, int length, boolean isRight){
        if(node==null) return;
        maxZigZag=Math.max(maxZigZag,length);
        if(!isRight){
            dfs(node.right,length+1,true);
            dfs(node.left,1,false);
        }
        else{
            dfs(node.left,length+1,false);
            dfs(node.right,1,true);
        }
    }
}