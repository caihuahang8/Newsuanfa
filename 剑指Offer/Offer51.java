package 剑指Offer;

public class Offer51 {
    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
     */
    int count = 0; //计算逆序对

    public int reversea_LignmentOfCount(int[] numbers){
        if (numbers.length ==0 ){
            return -1;//空的
        }


        int preIndex=0;//前一个数字的位置
        int curntIndex=1;//当前数字的位置

        while (curntIndex < numbers.length  ) {
            if (numbers[preIndex] > numbers[curntIndex]){
                count++;
            }
            preIndex++;
            curntIndex++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {4,3,1,0};
        Offer51 offer51 = new Offer51();
        int n =offer51.reversea_LignmentOfCount(numbers);
        System.out.println(n);
    }
}
