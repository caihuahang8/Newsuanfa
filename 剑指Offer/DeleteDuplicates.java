package 剑指Offer;

public class DeleteDuplicates<Node,Value> {
    private class  Node{
        Node next;
        Value value;
        public Node(){
        }
    }
    private DeleteDuplicates.Node delteDuplicatesNode(DeleteDuplicates.Node head){
        if (head.next == null || head == null){
            return  head;
        }
        DeleteDuplicates.Node Pnext = head.next;
        if (Pnext.value == head.value){
            while (head.next != null && head.value == head.value){
                head = head.next;
            }  return delteDuplicatesNode(head);
        }else {
            head.next = delteDuplicatesNode(head.next);
            return head;
        }
    }
}
