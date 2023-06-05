public static int editDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        return func(m,n,word1,word2,dp);
    }
    public static int func(int i,int j,String s1,String s2,int[][] dp){
        if(i==0) return dp[i][j]=j;
        if(j==0) return dp[i][j]=i;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
            if(s1.charAt(i-1)==s2.charAt(j-1)){ return dp[i][j]=func(i-1,j-1,s1,s2,dp);}
        return dp[i][j]=1+Math.min(func(i,j-1,s1,s2,dp),Math.min(func(i-1,j,s1,s2,dp),func(i-1,j-1,s1,s2,dp)));
    }
