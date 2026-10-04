class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
        int max = 0;
        for(int x:prices){
           min = Math.min(min,x);
           max = Math.max(max,x-min);
        }
        return max;
    }
}