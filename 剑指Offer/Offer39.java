package 剑指Offer;

public class Offer39 {
    public int moreThanHalfNumberis(int[] numbers){
        //选举出一个最有可能的数字
        if (numbers.length == 0){
            return -1;
        }
        int mojoyInt = numbers[0];
        for (int i =1, cnt=1;i < numbers.length; i++){
            cnt = numbers[i] == mojoyInt ? cnt+1 : cnt-1;
            if (cnt == 0){
                mojoyInt = numbers[i];
                cnt = 1;
            }
        }
        int cnt = 1;
        for (int number : numbers){
            if (number == mojoyInt){
                cnt++;
            }
        }
        return cnt > numbers.length /2 ? mojoyInt: -1;
    }
}
