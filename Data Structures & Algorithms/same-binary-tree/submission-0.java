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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(q,p);

    }

    public boolean same(TreeNode p,TreeNode q){
         if(p==q){
            return true;
         }
         if((p==null && q!=null)||(q==null && p!=null)){
            return false;
         }

         if(p.val!=q.val){
            return false;
         }

         return same(p.left,q.left) && same(p.right,q.right);
    }
}
