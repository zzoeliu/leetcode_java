package linklist;

import javax.management.ListenerNotFoundException;

/**
 * Created by ZoeLiu on 7/5/15.
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
 ↘
 c1 → c2 → c3
 ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:

 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.

 Design:
 The intersection length should be as long as or shorter than the smaller list
 Calculate the length and move pointer to the common part.
 */
public class IntersectionOfTwoLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){

        int length1=0,length2=0;

        ListNode p1=headA;
        ListNode p2=headB;

        while(p1!=null)
        {
            p1=p1.next;
            length1++;
        }
        while(p2!=null)
        {
            p2=p2.next;
            length2++;
        }

        int diff=Math.abs(length1-length2);
        p1=headA;
        p2=headB;
        if(length1>length2)
        {
            int i=0;
            while(i<diff)
            {
                p1=p1.next;
                i++;
            }
        }else if(length1<length2)
        {
            int i=0;
            while(i<diff)
            {
                p2=p2.next;
                i++;
            }
        }
        for(int i=0;i<Math.min(length1,length2);i++) {
            if (p1.val == p2.val)
            {
                return p1;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return null;


    }
}
