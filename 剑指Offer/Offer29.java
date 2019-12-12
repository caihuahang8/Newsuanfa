package 剑指Offer;

import java.util.ArrayList;

public class Offer29 {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int r1= 0, r2 = matrix.length - 1 ;
        int c1= 0, c2 = matrix[0].length - 1;
        while (c1 < c2 && r1 < r2){
            for (int i = c1; i <= c2 ; i++ ){
                arrayList.add(matrix[r1][i]);
            }
            for (int i = r1 + 1 ; i <= r2;i++){
                arrayList.add(matrix[i][c2]);
            }
            if (r1 != r2){
                for (int i = c2 ; i >= c1 ; i--){
                    arrayList.add(matrix[r2][i]);
                }
            }
            if (c1 != c2){
                for (int i = r2 ; i > r1 ; i-- ){
                    arrayList.add(matrix[i][c1]);
                }
            }
            r1++;r2--;c1++;c2--;
        }
        return arrayList;
    }
}
