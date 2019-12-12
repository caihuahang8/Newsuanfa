package 剑指Offer;

/**
 * 翻转单词顺序列
 * NowCoder
 * Input:
 * "I am a student."
 *
 * Output:
 * "student. a am I"
 */
public class Offer58_1 {
    /**
     * 先翻转字符串，在翻转单词
     */
    public void reversalWords(String strs,int start,int last){
        char[] chars = strs.toCharArray();
        reversal(chars,start,last);
        int i =0;
        int e ;
        int s ;
        while (i < strs.length()){
        //当遍历到空格的时候跳过
            while (chars[i] == ' ' && i < strs.length()) {
                i++;
            }
        //先记录当前单词的首字母位置
            e = s = i;
            while (chars[i] != ' ' && i < strs.length()){
                e++;
                i++;
            }
            reversal(chars,s,e-1);
        }
    }

    public void reversal(char[] chars,int startIndex , int lastIndex ){
        //tneduts a ma I
        while (startIndex< lastIndex){
            swap(chars,startIndex,lastIndex);
            startIndex++;
            lastIndex--;
        }
    }
    public void swap(char[] chars,int i,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
