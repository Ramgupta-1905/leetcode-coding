class Solution {
    public boolean check(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                count++;
            if(count>2) return false;
        }
        if(nums[0] < nums[nums.length-1])
            count++;
        if(count<2)
            return true;
        return false;
    }
}