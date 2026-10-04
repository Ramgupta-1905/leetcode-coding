class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
        int max = 0;
        for(int i = 0;i<prices.length;i++){
           int ele  = prices[i];
           min = Math.min(min,ele);
           max = Math.max(max,ele-min);
        }
        return max;
    }
}