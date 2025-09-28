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
class FindElements {
    HashSet<Integer> set=new HashSet<>();
    public FindElements(TreeNode root) {
        root.val=0;
        dfs(root);
    }
    public void dfs(TreeNode node){
        if(node!=null){
            if(node.left!=null) node.left.val=2*node.val+1;
            if(node.right!=null) node.right.val=2*node.val+2;
            set.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */