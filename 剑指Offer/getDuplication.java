package 剑指Offer;

public class getDuplication {
    public int  getDuplication(int[] numbers){
        int start = 1;
        int end = numbers.length - 1;
        while (end >= start){
            int mid = (end - start) >> 1 + start;
            int count = countRange(numbers,numbers.length,start,mid);
            if (end  == start){
                if (count>1){
                    return start;
                }else {
                    break;
                }
            }
            if (count > (mid - start +1 )){
                end = mid ;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }

    private int countRange(int[] numbers,int length,int start,int end){
        if (numbers == null){
            return 0;
        }
        int count = 0;
        for (int i =0 ;i<length; i++){
            while (numbers[i] >= start && numbers[i] <= end){
                ++count;
            }
        }
        return count;
    }
}
