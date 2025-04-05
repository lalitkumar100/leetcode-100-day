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

     private boolean isMirror(TreeNode Left,TreeNode Right){
        if(Left==null && Right==null)
        return true;
        else if(Left==null || Right==null)
        return false;
        else
        return Left.val==Right.val ? isMirror(Left.left,Right.right) ?isMirror(Left.right,Right.left):false:false; 
     }
        public boolean isSymmetric(TreeNode root) {
          if(root!=null){
            return isMirror(root.left,root.right);
          }
          return true;
    }
}
