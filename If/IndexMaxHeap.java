package If;

public class IndexMaxHeap<Item extends Comparable> {
   protected Item[] data; //存放数据
   protected int[] index; //存放索引堆
   protected int count;
   protected int capacity;
   //初始化构造
   private IndexMaxHeap(int capacity){
       data = (Item[]) new Comparable[capacity+1];
       index = new int[capacity +1];
       count = 0;//size的大小
       this.capacity = capacity;
    }
    private void swapIndex(int[] index,int i,int j){
       int k = index[i];
       index[i] = index[j];
       index[j] = k;
    }




    //核心方程
    private void shiftUp(int k){
       //k代表了当前节点
        while (k > 1 && data[index[k/2]].compareTo(data[index[k]] )<0){
            swapIndex(index,k,k/2);
            k = k /2;
        }
    }
    private void shiftDown(int k ){
       //k表示父节点
        while (2*k < count){
            // j 表示子节点
            int j = 2* k ;

            if (j+1 <= count && data[index[j]].compareTo(data[index[j+1]]) <0){
                j ++;
            }
            if (j+1 <=count && data[index[k]].compareTo(data[index[j]])>0){
                break;
            }
            swapIndex(index,k,j);
            k = j;
        }
    }
    public int getMaxIndex(){
        assert count > 0;
        return index[1]-1;
    }
    private Item getItem(int i ){
       assert i + 1 >= 1 && i + 1 <= capacity;
       return data[i+1];
    }

}
