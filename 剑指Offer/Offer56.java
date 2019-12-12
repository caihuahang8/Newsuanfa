package 剑指Offer;

/**
 * 重点复习
 */
public class Offer56 {
    public void findOpearOnce(int[] numbers,int[] num1,int[] num2){
        int length = numbers.length;
        if (length  == 2){
            num1[0] = numbers[0];
            num2[0] = numbers[1];
            return;
        }
        int bitResult = 0;
        for (int i=0;i < numbers.length;i++){
            bitResult ^= numbers[i];
        }
        int index = findBit1Index(bitResult);
        for(int i=0;i<numbers.length;i++){
            if (isBit1(index,numbers[i]) == 1){
                num1[0] ^=numbers[i];
            }else {
                num2[0] ^=numbers[i];
            }
        }
    }
    private  int findBit1Index(int bitResult){
        int index = 0;
        while ((bitResult & 1 )==0 && index<32){
            index++;
            bitResult >>=1;
        }
        return index;
    }

    /**
     * 左移index位校验当前字符位是不是1
     * @param index
     * @param numbers
     * @return
     */
    public int isBit1(int index,int numbers){
        return (numbers >> index & 1) == 1 ? 1 : 0;
    }
}
