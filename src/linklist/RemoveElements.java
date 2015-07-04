package linklist;

/**
 * Created by ZoeLiu on 7/4/15.
 * Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5
 Design: we need a listnode to track the list of node ,that is pre

 the original head will not change.
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head,int val)
    {
        ListNode pre=new ListNode(0);

        pre.next=head;
        ListNode cur=pre;
        while(cur.next!=null)
        {
            if(cur.next.val==val)
            {
                cur.next=cur.next.next;

            }else {

                cur = cur.next;
            }

        }
        return pre.next;

    }
}
