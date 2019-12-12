package 剑指Offer;

public class Offer48 {
    public int getNotOfDuplication(String str){
        int curLenghth = 0;//当前不重复长度
        int maxLength = 0;//之前不重复长度
        int[] preIndexs = new int[str.length()];//保存前一次出现的位置

        for (int i =0; i < str.length() ; i++){
            preIndexs[i] = -1;
        }
        for (int cur =0; cur < str.length();cur++){
            int c = str.charAt(cur) - 'a';
            int pre = preIndexs[c];
            if (pre == -1 || cur - pre > curLenghth){
                curLenghth++;
            }else {
                 maxLength = Math.max(maxLength,curLenghth);
                 preIndexs[c] = cur;//保存当前字母上次出现的地方
            }
        }
        maxLength = Math.max(curLenghth,maxLength);
        return maxLength;
    }
}
