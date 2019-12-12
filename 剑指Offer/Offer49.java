package 剑指Offer;

public class Offer49 {
    public int uglyNumber(int n){
        if (n <= 6){
            return n;
        }
        int i2=0,i3=0,i4=0;
        int[] dp = new int[n];
        dp[0]=1;
        for (int i=1;i<n;i++){
            int next2 = dp[i2]*2,next3=dp[i3]*3,next4=dp[i4]*5;
            dp[i] = Math.min(next2,Math.min(next3,next4));
            if (dp[i] == next2){
                i2++;
            }
            if (dp[i] == next3){
                i3++;
            }
            if (dp[i] == next4){
                i4++;
            }
        }
        return dp[n -1];
    }
}
