package quick;

public class quickSort {

    public void Sort(int[] arr){
        int n = arr.length;
        quickSort(arr,0,n);
    }
    private void quickSort(int[] arr,int l,int r){

        int p = partition(arr,l,r);
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,l);

    }
    public int partition(int[] arr,int l,int r){

        int v = arr[l];
        int j = l;
        for (int i = l+1;i<r;i++){
            if (arr[i] < v){
                swap(arr,j,i);
            }
        }
        swap(arr,j,l);
        return j;
    }
    public void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
