class Solution {
    public int maxProduct(int[] nums) {
        int max =0;
        int smax = 0;
        for(int x: nums){
            if(x >=max && x>=smax){
                smax = max;
                max = x;
            }
            else if(x<max && x>=smax)
                smax = x;
        }
        return (max-1)*(smax-1);
    }
}