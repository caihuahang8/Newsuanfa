package If;

import java.util.Objects;

public class MaxHeap<Item extends  Comparable> {
    //最大堆特点父节点始终比左右两个子女节点大
    private Item[] data;
    private int count;
    private int capacity;

    public MaxHeap(int capacity){
        data = (Item[]) new Comparable[capacity +1];
        this.count = 0;
        this.capacity= capacity ;
    }
    //构造最大堆
    public MaxHeap(Item[] arr){
        //先初始化
        int n = arr.length;
        data =  (Item[]) new Comparable[n +1];
        //迭代，将arr的数据装入到data里面
        for (int i = 1;i < n +1 ; i ++){
            data[i] = arr[i];
        }
        //进行shiftDown操作,从最后一个叶子节点开始
        for (int i = count/2; i>=1 ; i--){
            shiftDown(i);
        }
    }
    public int size(){
        return  count;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    private void swap(int i, int j){
        Item t = data[i];
        data[i] = data[j];
        data[j] = t;
    }
    public  void insert(Item item){
        assert count + 1 <= capacity;
        data[count  +1 ]  = item;
        count++;
        shiftUp(count);
    }
    //取到堆顶
    public Item getMax(){
        assert count>1;
        return data[1];
    }
    ///取到最大的值
    public Item extractMax(){
        assert count > 1;
        Item ret =  data[1];
        swap(1,count);
        count--;
        shiftDown(1);
        return ret;
    }
    //核心的方程式
    public  void shiftUp(int k){
        while (k > 1 &&  data[k/2].compareTo(data[k]) <0 ){
            swap(k/2,k);
            k=k/2;
        }
    }
    public void shiftDown(int k ){
        //初始化j是左子节点
        //k是当前节点
        //它的子节点还能小于整个数组
        while (2*k <= count){
            int j = 2*k;
            if (j <= count && data[j].compareTo(data[j+1]) < 0 ){
                j++;
            }
            //当父节点比子节点都大的时候就没必要继续下去，证明已经到最后的位置
            if (data[k].compareTo( data[j]) >0){
                break;
            }
            //如果还没有结束，继续比较，将k的当前值设置为j的值
            //j = 2*k || j = 2*k +1
            swap(k,j);
            k = j;
        }
    }
}
