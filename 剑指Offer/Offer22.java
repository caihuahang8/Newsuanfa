package 剑指Offer;

public class Offer22<Value> {
    class ListNode{
        Value value;
        ListNode next;
    }
    /**
     * 链表中倒数第K个节点
     */
    private ListNode findKthToTail(ListNode head,int k){
        if (head == null){
            return null;
        }
        ListNode p1 = head;
        for (int i =k; i>0; i--){
          p1 =  p1.next;
        }
        if (k < 0){
            return null;
        }
        ListNode p2 = head;
        while (p1.next!= null){
           p1 =  p1.next;
           p2 = p2.next;
        }
        return p2;
    }
}
