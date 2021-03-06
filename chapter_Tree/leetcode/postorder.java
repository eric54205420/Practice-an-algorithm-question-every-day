/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>result = new LinkedList<>();
        if(root==null) return result;
        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer>result){
        if(root == null) return;
        helper(root.left, result);
        helper(root.right, result);
        result.add(root.val);
    }
}
