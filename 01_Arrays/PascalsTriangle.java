import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        long[][] dp = new long[51][51];
		ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		for(int i=0;i<n;i++){
			ArrayList<Long> arr = new ArrayList<>();
			for(int j=0;j<=i;j++){
				if(i==j ||j==0){
					dp[i][j]=1;
				}else{
					dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
				}
				arr.add(dp[i][j]);
			}
			ans.add(arr);
		}
		return ans;
	}
}
