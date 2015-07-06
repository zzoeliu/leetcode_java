package linklist;

/**
 * Created by ZoeLiu on 7/5/15.
 */
public class RemoveNthNode {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null || l2==null)
        {
            return l1==null? l2: l1;
        }

        ListNode mergeList=new ListNode(0);
        ListNode p1=mergeList;

        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                p1.next=l1;
                p1=p1.next;
                l1=l1.next;
            }
            else if(l1.val>l2.val)
            {
                p1.next=l2;
                p1=p1.next;
                l2=l2.next;
            }else
            {
                p1.next=l1;
                p1=p1.next;
                p1.next=l2;
                p1=p1.next;
                l1=l1.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            p1.next=l1;
            p1=p1.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            p1.next=l2;
            p1=p1.next;
            l2=l2.next;
        }
        return mergeList;

    }
}
