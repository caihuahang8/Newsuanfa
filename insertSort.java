public class insertSort {
    public static void insertSort(Comparable[] arr ){
        for (int i =0 ; i< arr.length-1 ;i++){
            for (int j = i +1 ; 0 <j ; j--){
                if ( arr[j-1].compareTo(arr[j])>0){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    private static void swap(Comparable[] arr, int i ,int j) {
        Comparable k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    public static void main(String[] args) {
        Comparable[] a = {10,9,8,7,6,5,4,3,2,1};
        insertSort(a);
        for ( int i =0 ; i <10 ; i++){
            System.out.println(a[i]);
        }
    }
}
