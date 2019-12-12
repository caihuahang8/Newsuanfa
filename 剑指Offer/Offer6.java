package 剑指Offer;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Arrays;
//从头到尾巴打印出来
public class Offer6 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public ArrayList<Integer> printHeadToTail(ListNode listNode){
        ListNode node = new ListNode(-1);
        while (node!=null){
            ListNode nextNode = listNode.next;
            listNode.next = node.next;
            node.next = listNode;
            listNode = nextNode;
        }
        ArrayList<Integer> listNodes = new ArrayList<>();
        node = node.next;
        while (node!=null){
            listNodes.add(node.val);
            node = node.next;
        }
        return listNodes;
    }
}
