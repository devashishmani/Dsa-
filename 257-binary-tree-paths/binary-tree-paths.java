// 
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }

    public void helper(TreeNode root, List<String> ans, String s) {
        if (root == null) return;

        // Build path string correctly
        if (s.isEmpty()) {
            s = Integer.toString(root.val);
        } else {
            s = s + "->" + root.val;
        }

        // If leaf node, add final path
        if (root.left == null && root.right == null) {
            ans.add(s);
            return;
        }

        // Recurse on children with accumulated path
        helper(root.left, ans, s);
        helper(root.right, ans, s);
    }
}
