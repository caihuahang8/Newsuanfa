package 剑指Offer;

import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

/**
 * 题目前提是两个已经排序好的链表，value和next已经确认好，思路就是利用递归比较链表的值，
 * 小的指向大的，迭代的结束条件是每一条链表为空。
 */
public class Offer25<Value extends Comparable> {
    class ListNode{
        Value value;
        ListNode next;
        public ListNode(Value value) {
            this.value = value;
        }
    }



    private ListNode merge(ListNode listNode1,ListNode listNode2){
        //利用迭代
        //当迭代到最后一个结点的时候判断到底是哪一个链条的返回相反的链条的结点
        if (listNode1.next == null){
            return listNode2;
        }
        if (listNode2.next == null){
            return listNode1;
        }
        if (listNode1.value.compareTo( listNode2.value)<= 0){
            listNode1.next =   merge(listNode1.next,listNode2);
            return listNode1;
        }else {
            listNode2.next =   merge(listNode1,listNode2.next);
            return listNode2;
        }
    }


}
