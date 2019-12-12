public class QuickSort2 {

    Untils untils = new QuickSort();

    private  void sort(){

    }
    private  void sort(Comparable[] arr, int l, int r){

        // 对于小规模数组, 使用插入排序
        if( r - l <= 15 ){
            insertSort.insertSort(arr);
            return;
        }
        int p = untils.partition(arr, l, r);
        sort(arr, l, p-1 );
        sort(arr, p+1, r);
    }

}
