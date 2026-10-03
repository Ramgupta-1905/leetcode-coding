class Solution {
    public int findClosestNumber(int[] nums) {
        int close =Math.abs(nums[0]);
        int can = nums[0];
        for(int i =1;i<nums.length;i++){
            int distance = Math.abs(nums[i]);
            if(close == distance)
                can = Math.max(nums[i],can);
            if(close>distance){
                can = nums[i];
            close = distance;
            }
        }
        return can;
    }
}