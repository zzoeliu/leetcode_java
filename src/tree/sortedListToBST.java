package tree;


/**
 * Created by ZoeLiu on 7/8/15.
 */
//import linklist.ListNode;

import java.util.ArrayList;

public class sortedListToBST {
    static ListNode h;
    public TreeNode sortedListToBST(ListNode head)
    {
        if(head==null) return null;
        int length= getLength(head);
        h=head;
        return sortedListToBST(0,length-1);

    }
    public int getLength(ListNode head)
    {
        int len=0;
        ListNode p=head;
        while(p!=null)
        {
            len++;
            p=p.next;
        }
        return len;
    }
    public TreeNode sortedListToBST(int start,int end)
    {
        if(start>end) return null;

        int mid=(end+start)/2;
        TreeNode left=sortedListToBST(start,mid-1);
        TreeNode root=new TreeNode(h.val);
        h=h.next;
        TreeNode right=sortedListToBST(mid+1,end);

        root.left=left;
        root.right=right;
        return root;
    }
}
