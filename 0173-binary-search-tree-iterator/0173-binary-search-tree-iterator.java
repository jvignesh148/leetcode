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
class BSTIterator {
    ArrayList<Integer> list=new ArrayList<>();
    public void dfs(TreeNode node){
        if(node!=null){
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
        }
    }
    int ind=0;
    public BSTIterator(TreeNode root) {
        dfs(root);
    }
    
    public int next() {
        int result=list.get(ind);
        ind++;
        return result;
    }
    
    public boolean hasNext() {
        if(ind>=list.size()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */