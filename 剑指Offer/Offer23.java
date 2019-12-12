package 剑指Offer;

public class Offer23<Value> {
    class ListNode{
        Value value;
        ListNode next;
    }

    private ListNode getMeetingNode(ListNode head){
        ListNode fast_node = head,slow_node = head;
        do {
            fast_node = fast_node.next.next;
            slow_node = slow_node.next;
        }while (fast_node != slow_node);
        //相遇之后
        ListNode new_fast_node = head;
        while (new_fast_node != slow_node){
            new_fast_node = new_fast_node.next;
            slow_node = slow_node.next;
        }
        return slow_node;
    }
}
