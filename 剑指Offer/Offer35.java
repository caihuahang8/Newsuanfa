package 剑指Offer;

public class Offer35 {
    public RandomListNode clone(RandomListNode pHead){

        RandomListNode cur = pHead;
        //1.每一步插入一个新值
        while (cur !=null){
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = cur.next;
        }
        //2.对复制节点random赋值
        cur = pHead;
        while (cur!=null){
            RandomListNode clone = cur.next;
            clone.random = cur.random;
            cur = clone.next;
        }
        //3.拆分
        cur = pHead;
        RandomListNode cloneHead = cur.next;
        while (cur!=null){
            RandomListNode next= cur.next;
            cur.next = next.next;
            cur = next;
        }
        return cloneHead; 
    }
}
