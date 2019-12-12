package 剑指Offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Offer38 {

    private void Permutation(char[] chars){
        ArrayList<String> permutationList = new ArrayList<String>();
        if (chars == null){
            return;
        }
        permutation(chars,permutationList,0);

    }
    private void permutation(char[] chars,ArrayList<String> list,int index){
        if (index == chars.length-1){
            //表示完成一种排序，添加到list里面
            list.add(String.valueOf(chars));
        }else {
            Set<Character> characters = new HashSet<Character>();
            for (int i = index; i < chars.length ; i++){
                //如果你要交换的目标重复的不执行
                if ( i == index || !characters.contains(chars[i])){
                    characters.add(chars[i]);
                    swap(chars,index,i);
                    permutation(chars,list,index+1);
                    swap(chars,index,i);
                }
            }
        }
    }
    private void swap(char[] chars,int i , int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
