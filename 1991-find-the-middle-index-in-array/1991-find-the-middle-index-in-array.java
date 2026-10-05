class Solution {
    public int findMiddleIndex(int[] nums) {
        int rightSum =0;
        int leftSum =0;
        for(int i =0;i<nums.length;i++){
            leftSum+=nums[i];
        }
        for(int i =0;i<nums.length;i++){
            if(leftSum-nums[i] == rightSum)
                return i;
            rightSum +=nums[i];
            leftSum -=nums[i];
        }
        return -1;
    }
}