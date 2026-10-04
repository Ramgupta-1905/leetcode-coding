class Solution {
    public int maxProduct(int[] nums) {
        int currmin = nums[0];
        int current = nums[0];
        int max = nums[0];
        for(int i =1;i<nums.length;i++){
            int x =nums[i];
            int prevMin = currmin;
            int prevMax = current;

            currmin = Math.min(x, Math.min(x * prevMin, x * prevMax));
            current = Math.max(x, Math.max(x * prevMin, x * prevMax));
            max =Math.max(current,max);
        }
        return max;
    }
}