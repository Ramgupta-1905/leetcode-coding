class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] memo = new Integer[n][n];
       return solve(0,n-1,piles,memo) >0;
    
    }
    private int solve(int left,int right,int[] nums,Integer[][] memo ){
         if(left == right)
            return nums[left];
        if(memo[left][right] !=null) return memo[left][right];
        int leftSum = nums[left] - solve(left+1,right,nums,memo);
        int rightSum = nums[right] - solve(left,right-1,nums,memo);

        return memo[left][right]=Math.max(leftSum,rightSum);
    }
}