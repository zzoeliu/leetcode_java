package tree;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/8/15.
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root)
    {
        if(root==null) return 0;
        int left=getLeftHeight(root.left)+1;
        int right=getRightHeight(root.right)+1;
        if(left==right)
        return (int)Math.pow(2,left)-1;
        else return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int getLeftHeight(TreeNode root)
    {
        if(root==null) return 0;
        int leftHeight=0;
        while(root.left!=null)
        {
            leftHeight++;
            root=root.left;
        }
        return leftHeight;
    }
    public int getRightHeight(TreeNode root)
    {
        if(root==null) return 0;
        int rightHeight=0;
        while(root.right!=null)
        {
            rightHeight++;
            root=root.right;
        }
        return rightHeight;
    }
}
