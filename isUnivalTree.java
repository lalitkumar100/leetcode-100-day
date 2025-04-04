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
        int ans;
  private  boolean tree(TreeNode root){
           if(root==null){
            return true;
         }
         if(root.val!=ans)
         return false;
              if(root!=null){
           if(tree(root.left)&&tree(root.right))
           return true;

        }
        return false;
    
  }
    public boolean isUnivalTree(TreeNode root) {
     ans = root.val;
         if(root==null){
            return true;
         }
        if(root!=null){
           if(tree(root.left)&&tree(root.right))
           return true;

        }
        return false;
    }
}
