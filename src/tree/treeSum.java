package tree;

/**
 * Created by ZoeLiu on 10/21/15.
 */
public class treeSum {
    public static int global_max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        if(root == null || root.left == null || root.right == null){
            return Integer.MIN_VALUE;
        }
        maxPathSumHelper(root);
        return global_max;
    }

    public int maxPathSumHelper(TreeNode root) {
        // Write your solution here.
        if(root == null){
            return 0;
        }
        int left = maxPathSumHelper(root.left);
        int right = maxPathSumHelper(root.right);
        if (root.left != null && root.right != null){
            global_max = Math.max(global_max, left + right + root.val);
        }
        if (root.left == null){
            return right + root.val;
        }else if (root.right == null){
            return left + root.val;
        }
        return Math.max(left,right) + root.val;
    }
}
