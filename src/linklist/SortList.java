package linklist;

/**
 * Created by ZoeLiu on 7/8/15.
 */
public class SortList {
    public ListNode sortList(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode faster=head;
        ListNode slower=head;

        while(faster.next!=null&&faster.next.next!=null)
        {
            slower=slower.next;
            faster=faster.next.next;
        }

        ListNode firstHalf=head;
        ListNode secondHalf=slower.next;
        slower.next=null;
        return mergeSortList(sortList(firstHalf),sortList(secondHalf));

    }
    public ListNode mergeSortList(ListNode left, ListNode right)
    {
        if(left==null)
            return right;
        if(right==null)
            return left;
        ListNode newList=new ListNode(0);
        ListNode p=newList;
        while(left!=null&&right!=null)
        {
            if(left.val<=right.val)
            {
                p.next=left;
                p=p.next;
                left=left.next;
            }else
            {
                p.next=right;
                p=p.next;
                right=right.next;
            }
        }
        if(left!=null)
        {
            p.next=left;
        }
        if(right!=null)
        {
            p.next=right;
        }

        return newList.next;

    }
}
