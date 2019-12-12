package 剑指Offer;

public class Offer47 {
    public int getMostOfPresnrVal(int[][] present){
        for (int i =0;i<present.length;i++){
            for (int j =0;j<present[0].length;j++){
                if (i==0&&j==0){
                  continue;
                }else if (i==0){
                    present[i][j] = present[i][j-1];
                }else if (j==0){
                    present[i][j] = present[i-1][j];
                }else {
                    int tempFromUp = present[i-1][j];
                    int tempFromLeft = present[i][j-1];
                    if (tempFromLeft > tempFromUp){
                        present[i][j] = tempFromLeft;
                    }else {
                        present[i][j] = tempFromUp;
                    }
                }
            }
        }
        return present[present.length-1][present[0].length-1];
    }
}
