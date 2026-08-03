class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for(int i =0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int diff = Math.max(nums[i],nums[j]) - Math.min(nums[i],nums[j]);
                if(diff <= Math.min(nums[i],nums[j])){
                    int xor = nums[i] ^ nums[j];
                    max = Math.max(max,xor);
                }
            }
        }
        return max;
    }
}