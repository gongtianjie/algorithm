package week_1;


import learn.ListNode;

/**
 * 给你一个链表，每[]k[]个节点一组进行翻转，请你返回翻转后的链表。
 *
 * k[]是一个正整数，它的值小于或等于链表的长度。
 *
 * 如果节点总数不是[]k[]的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k){
        //1.分组
        //2.翻转
        ListNode protect=new ListNode(0,head);
        ListNode last=protect;

        while(head!=null){
           //分组
            //获取到尾节点
            ListNode end = getEnd(head, k);
            //存下尾节点的下一个节点，即下一组的头节点
            ListNode nextGroupNode=end.next;
            //将组内的节点进行反转
            reverseList(head,end);
            //将当前节点的尾巴节点指向上一组的尾巴节点
            last.next=end;
            //将当前节点的头节点指向下一组的头节点
            head.next=nextGroupNode;
            last=head;
            head=nextGroupNode;
        }

        return protect.next;
    }

    private static ListNode getEnd(ListNode head, int k){
        //分组
        while(head!=null){
            k--;
            //由于K 小于或等于链表的长度 所以当k=0时，一定已经到结尾了
            if(k==0||head.next==null) break;
            head=head.next;
        }
        return head;
    }

    //翻转Node
    private void reverseList(ListNode head,ListNode end){
        if(head==end){
           return;
        }
        ListNode last=head;
        head=head.next;
        while(head!=end){
            ListNode nextNode=head.next;
            head.next=last;
            last=head;
            head=nextNode;
        }
        end.next=last;
    }
}

