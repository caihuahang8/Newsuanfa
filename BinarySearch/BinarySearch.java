package BinarySearch;

import org.omg.PortableInterceptor.INACTIVE;

//二分查找算法
public class    BinarySearch {
    //serch,前提必须是顺序的
    private static boolean serch(Comparable[] arr, int target ){
        int n = arr.length;
      return  1 == binarySearch(arr,0,n -1 , target);
    }
    private static int binarySearch(Comparable[] arr,int l ,int r ,int target){
        if( l > r )
            return -1;
        int mid = l + (r-l)/2;
        if (arr[mid].compareTo(target) ==0){
            return mid;
        }else if (arr[mid].compareTo(target) > 0){
            return binarySearch(arr,l,mid -1 ,target);
        }else {
            return binarySearch(arr,mid +1 ,r,target);
        }
    }

    public static void main(String[] args) {
        int N = 100;
        Integer[]  arr = new Integer[N];
        for (int i = 0 ; i < N; i++){
            arr[i] =  new Integer(i);
        }
     Boolean b =   serch(arr,1);
        System.out.println(b);
    }
}
