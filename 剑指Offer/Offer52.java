package 剑指Offer;

public class Offer52 {
    class ListNode{
        int value;
        ListNode next;
        public ListNode(int Value){
            this.value = value;
        }
    }

    /**
     * p1： 0-1-2-3-4-5-null(此时遇到ifelse)-a-b-4-5-null
     * p2:  a-b-4-5-null(此时遇到ifelse)0-1-2-3-4-5-null
     * @param head1
     * @param head2
     * @return
     */
    public ListNode getFirstCommon(ListNode head1,ListNode head2){
        while (head1 != head2){
            head1 = (head1==null)? head2:head1.next;
            head2 = (head2==null)? head1:head1.next;
        }
        return head1;
    }
}
