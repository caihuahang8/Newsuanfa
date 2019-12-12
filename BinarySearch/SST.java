package BinarySearch;

import javax.xml.soap.Node;

public class SST<Key extends Comparable<Key>,Value>{
    public class  Node{
        private Key key;
        private Value value;
        private Node next ;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }
    private Node head;  // 表头
    private int count;
    public SST(){
        head = null;
        count = 0;
    }
    public boolean isEmpty(){
        return count ==0;
    }
    public int size(){
        return count;
    }
    //向顺序表插入一个key，value
    public void insert(Key key,Value value){
        //先查看顺序表有没有一样的
       Node node  = head;
       while (node != null){
           if (key.compareTo(node.key) == 0) {
               node.value = value;
               return;
           }
           node = node.next;
       }
       //如果不存在一样的，插在表头
        Node newNode = new Node(key,value);
       newNode.next = head;
       head = newNode;
       count++;
    }
    //查找顺序表是否包含这个Key
    public boolean contain(Key key){
        Node node = head;
        while (node !=null){
            if (node.key.compareTo(key) == 0){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    // 在顺序查找表中查找key所对应的value, 若value不存在, 则返回NULL
    public Value search(Key key ,Value value){
        Node node = head;
        while (node !=null){
            if (node.key.compareTo(node.key) ==0){
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
    // 在顺序查找表中删除(key,value)所对应的节点
    private void remove(Key key){


        //所对应的节点是头节点
       if (key.compareTo(head.key) ==0){
           Node delNode = head;
           head = head.next;
           delNode = null;
           count--;
           return;
       }
        //不是头节点，不断的向下查找直到找到相对应的节点
        Node node = head;
        while (node.next != null && node.next.key.compareTo(key) !=0 ){
            node = node.next;
        }
        //找到以后删除
        if (node.next != null){
        Node delNode = node.next;
        node.next = delNode.next;
        delNode.next = null;
        count--;
        return;
        }
    }
}
