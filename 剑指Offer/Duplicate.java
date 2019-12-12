package 剑指Offer;

public class Duplicate {
    public boolean duplicate(int[] num,int length,int[] duplicate){
        if (num ==null || length <=0){
            return false;
        }
        for (int i = 0 ; i< length; i++){
            while (i != num[i]){
                if (num[i] == num[num[i]]){
                    duplicate[0] = num[i];
                    return true;
                }
            }
            swap(num,num[i],i);
        }

        return false;
    }

    public void swap(int[] num,int i,int j){
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }
}
