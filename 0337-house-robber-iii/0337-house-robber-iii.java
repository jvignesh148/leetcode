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
    public int rob(TreeNode root) {
        int[] res = traverse(root);
        return Math.max(res[0], res[1]);
    }
 
 
    private int[] traverse(TreeNode root){
        if(root == null){
            return new int[] {0,0};
        }
 
        int[] left = traverse(root.left);
        int[] right = traverse(root.right);
 
        int robCurr = root.val + left[0] + right[0];
 
        int skipCurr = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
 
        return new int[] {skipCurr, robCurr};
    }
}