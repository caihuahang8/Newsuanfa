public class SelectionSort {
    private SelectionSort(){}
    public static void sort(Comparable[] arr) {
        int n = arr.length;

        for (int i =0 ; i<n ; i++){
            for (int j = i +1 ; j<n ; j++){
                // 寻找[i, n)区间里的最小值的索引
                int minIndex = i;
                if (arr[j].compareTo( arr[minIndex]) < 0 ){
                    minIndex = j;
                }
                swap(arr,i,minIndex);
            }
        }
    }
    private static void swap(Object[] arr, int i , int j){
        Object k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    public static void main(String[] args) {
        /* Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.sort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
        int n = 1000;
        Integer[] array =SortTestHelper.generateRandomArray(n,0,100);
        sort(array);
        SortTestHelper.printArray(array);
    }*/
        //______分割线________________
        int N = 20000;
       Integer[] arr =  SortTestHelper.generateRandomArray(N,0,1000);

        SortTestHelper.testSort2("SelectionSort",arr);
    }

}
