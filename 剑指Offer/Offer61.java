package 剑指Offer;

public class Offer61 {
    public boolean isContinues(int[] numbers){
        int cnt = 0;//计数
        //计算出癞子的数目
        for(int num : numbers){
            if (num == 0){
                cnt++;
            }
        }

        for (int i= 0 ; i < numbers.length-1;i++){
            if (numbers[i+1] == numbers[i]){
                return false;
            }
            cnt -= numbers[i+1] - numbers[i] -1;
        }

        return cnt>=0;
    }
}
