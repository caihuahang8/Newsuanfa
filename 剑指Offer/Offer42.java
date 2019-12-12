package 剑指Offer;

public class Offer42 {
    public int findSumOfArr(int[] arr){
        int max=arr[0];
        int res=arr[0];
        for (int i = 0 ; i< arr.length ; i++){
           max =  Math.max(arr[i]+max,arr[i]);
           res = Math.max(max,res);
        }
        return res;
    }
}
