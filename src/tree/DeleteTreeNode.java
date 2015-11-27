package tree;

/**
 * Created by ZoeLiu on 9/16/15.
 */
public class DeleteTreeNode {
    public TreeNode delete(TreeNode root, int key) {
        // Write your solution here.
        if (root == null)
            return null;
        if (root.val < key){
            root.right = delete(root.right, key);
            return root;
        }
        if (root.val > key){
            root.left = delete(root.left,key);
            return root;
        }
        //now we need to delete root
        if (root.left == null && root.right == null)
            root = null;
        else if (root.left == null){
            root = root.right;
        }else if (root.right == null){
            root = root.left;
        }else{
            if(root.right.left == null){
                root.right.left = root.left;
                root = root.right;
            }else{
                TreeNode pre = root.right;
                TreeNode cur = pre.left;
                while(cur.left != null){
                    pre = cur;
                    cur = cur.left;
                }
                pre.left = pre.left.right;
                cur.left = root.left;
                cur.right = root.right;
                root = cur;
            }
        }
        return root;
    }
}
