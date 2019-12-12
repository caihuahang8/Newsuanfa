package 剑指Offer;

import java.util.List;

public class Offer24<Value> {

    class ListNode{
        Value value;
        ListNode next;
    }
    //der
    private ListNode ReverseList(ListNode head){
        /**
         * 保存所有的节点的前后信息
         */
        if (head == null || head.next == null){
            return  head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode newNode = ReverseList(next);
        next.next=head;
        return newNode;
    }


}
