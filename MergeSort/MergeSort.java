package MergeSort;

import java.util.Arrays;

public class MergeSort {
    /**
     * 归并算法
     */
    public void mergeSort(int[] arr,int l,int r){
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        if (arr[mid] > arr[mid+1]) {
            merge(arr, l, mid, r);
        }
    }

    public void merge(int[] arr,int l ,int mid ,int r){
        int[] aux = Arrays.copyOfRange(arr,l,r+1);
        int i=l;
        int j=mid+1;
        for(int k=l;i<r;i++) {
            if (i > mid) {
                arr[k] = aux[j-l];
                j++;
            }else if (j > r){
                arr[k] = aux[i-l];
                i++;
            }else if (aux[i-l]<aux[j-l]){
                arr[k] = aux[i-l];
            }else {
                arr[k] = aux[j-l];
            }
        }
    }
}
