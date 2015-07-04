package linklist;

import java.util.LinkedList;

/**
 * Created by ZoeLiu on 7/4/15.
 * design we need two listnode to track all nodes in the linkedlist. still need an extra node to record the next one.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head)
    {
        if(head==null || head.next==null) return head;

        ListNode pre=head;
        ListNode cur=head.next;

        head.next=null;
        while(pre!=null && cur!=null)
        {
            ListNode nt=cur.next;

            cur.next=pre;
            pre=cur;
            if(nt!=null)
            {
                cur=nt;

            }else break;

        }

        return cur;

    }

}
