class Solution {
    public int findClosestNumber(int[] nums) {
        int can = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int distance = Math.abs(nums[i]);

            if (distance < Math.abs(can)) {
                can = nums[i];
            }
            else if (distance == Math.abs(can)) {
                can = Math.max(can, nums[i]);
            }
        }

        return can;
    }
}