package tree;

/**
 * Created by ZoeLiu on 7/4/15.
 * Design:
 * Invert a binary tree.

 4
 /   \
 2     7
 / \   / \
 1   3 6   9
 to
 4
 /   \
 7     2
 / \   / \
 9   6 3   1
 */
public class InvertBinTree {
    public TreeNode invertTree(TreeNode root)
    {
        if(root==null) return  root;
        if(root.left!=null || root.right!=null)
        {
            TreeNode temp=new TreeNode(0);
            temp=invertTree(root.left);
            root.left=invertTree(root.right);
            root.right=temp;
        }
        return root;

    }
}
