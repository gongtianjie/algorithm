package learn;


/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 */
public class ReversList {


    public  ListNode reverseList(ListNode head){
        ListNode last=null;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=last;
            last=head;
            head=nextNode;
        }
        return last;
    }

}


