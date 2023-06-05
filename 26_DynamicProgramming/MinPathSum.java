    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[201][201];
        return solve(grid,0,0);
    }
    public int solve(int[][] grid,int row,int col){
        if(row>=grid.length || col>=grid[0].length){
            return dp[row][col]=3000;
        }
        if(row==grid.length-1 && col==grid[0].length-1){
            return dp[row][col]=grid[row][col];
        }
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        return dp[row][col]=grid[row][col]+Math.min(solve(grid,row+1,col),solve(grid,row,col+1));
    }
