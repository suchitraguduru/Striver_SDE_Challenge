
public class Solution {
	static int[][] dp;
	public static int lcs(String text1, String text2) {
		dp = new int[1001][1001];
        int l1 = text1.length();
        int l2 = text2.length();
        return solve(text1,text2,0,0,l1,l2);
    }
    public static int solve(String text1, String text2,int i,int j,int l1,int l2){
        if(i==l1 || j==l2){
            return 0;
        }else if(dp[i][j]!=0){
            return dp[i][j];
        }else if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+solve(text1,text2,i+1,j+1,l1,l2);
        }else{
            return dp[i][j]=Math.max(solve(text1,text2,i+1,j,l1,l2),solve(text1,text2,i,j+1,l1,l2));
        }
    }

}
