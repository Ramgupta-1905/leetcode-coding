class Solution {
    public int findClosestNumber(int[] nums) {
        int can = nums[0];
        for(int i =1;i<nums.length;i++){
            int distance = Math.abs(nums[i]);
            if(Math.abs(can) == distance)
                can = Math.max(nums[i],can);
            if(Math.abs(can)>distance){
                can = nums[i];
            }
        }
        return can;
    }
}