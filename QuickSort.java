import java.util.Map;

public class QuickSort implements Untils {


    public static  void sort(Comparable[] arr){
        int n = arr.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,n-1);
    }
    public void sort(Comparable[] arr , int l , int r ){
        if(l>=r){
            return;
        }

        //索引点p,用partition这个函数来返回
        int p = partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }
    public  int partition(Comparable[] arr,int l , int r){
     //设置一个目标值v,用来比较大小
     Comparable v = arr[l];

     //初始化小于部分的定位
        int j = l;
        //循环整个函数，用i来表示当前的定位
        for(int i = l + 1 ; i < r ; i++){
            if (arr[i].compareTo(v) < 0 ){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr,l,j);
     return j;
    }
    public  int partition2(Comparable[] arr,int l , int r){
        swap( arr, l , (int)(Math.random()*(r-l+1))+l );

        Comparable v = arr[l];

        //i是小于部分在最开始慢慢的往后面，j是大于部分在最后面慢慢往前
        int i = l+1 , j = r ;
        while (true) {
            //arr[l+1....i) < v, arr(j....r]
            while (arr[i].compareTo(v) < 0 && i < r) {
                i++;
            }
            while (arr[j].compareTo(v) > 0 && j > i) {
                j--;
            }
            if (i > r) {
                break;
            }
            swap(arr,i,j);
            i++;
            j--;
        }
        swap(arr,l,j);
        return j;
    }
    public int partition3(Comparable[] arr, int l , int r){
        //设计随机数
        swap(arr,l,(int)(Math.random()*(r-l+1))+l);
        Comparable v = arr[l];
        //初始化定位
        int lt = l;
        int gt = r+1;
        int i = l+1;
        while (i<gt){
            if (arr[i].compareTo(v) <0){
                swap(arr,i,lt+1);
                lt++;
                i++;
            }else if (arr[i].compareTo(v) > 0){
                swap(arr,gt,gt-1);
                gt--;
            }else {
                i++;
            }
        }
        swap(arr,l,lt);
      return lt;
    }


    public static void swap(Object[] arr,int i ,int j){
        Object k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
