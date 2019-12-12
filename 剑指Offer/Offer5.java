package 剑指Offer;

/**
 Input:
 "A B"

 Output:
 "A%20B"
 */
public class Offer5 {
    public String replaceSpace(StringBuffer strs){
        int p1 = strs.length()-1;//第一个指针，指向原数组的最后一个字母
        //计算有多少个空格
        for (int i = 0; i<=p1;i++){
            if (strs.charAt(i)==' '){
                strs.append("  ");
            }
        }
        int p2 = strs.length()-1;
        while (p1>=0&&p1<p2){
            char words = strs.charAt(p1--);
            if (strs.charAt(p1)==' '){
                strs.setCharAt(p2--,'0');
                strs.setCharAt(p2--,'2');
                strs.setCharAt(p2--,'%');
            }else {
                strs.setCharAt(p2--,words);
            }
        }
        return strs.toString();
    }
}
