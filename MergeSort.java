import java.util.Arrays;

public class MergeSort {
    public static void merge(Comparable[] arr,int l,int mid,int r ){
       Comparable[] aux = Arrays.copyOfRange(arr,l,r+1);
       int i = l , j =mid +  1;
       for (int k = l ; k<=r ; k++){
           //左边已经遍历完了
           if (i>mid){
               arr[k] = aux[j - l]; j ++;
           }else if(j >r){
               arr[k] = aux[i - l]; i ++ ;
           }else if(aux[i-l].compareTo(aux[j-l]) < 0 ){
               arr[k] = aux[i - l];
               i ++ ;
           }else {
               arr[k] = aux[j - l];
               j++;
           }
       }
    }

    public static void sort(Comparable[] arr ,int l , int r){
        if (l>=r){
            return;
        }

        int mid = (l+r)/2 ;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    ///递归二分
    public static void sort(Comparable[] arr){
        int n  = arr.length;
        sort(arr,0,n-1);
    }

    public static void main(String[] args) {
        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        sort(arr);
        for ( int i =0 ; i <10 ; i++){
            System.out.println(arr[i]);
        }
    }
}
