class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
             int x = nums[i];
            if(nums[i] == i+1 || x<=0 || x>nums.length || nums[x-1] == x){
                i++;
                continue;
            }
            else{
            int temp = nums[x-1];
            nums[x-1] = nums[i];
            nums[i] = temp;
            }
        }
        for(i =0;i<nums.length;i++){
            if(nums[i] != i+1)
            return i+1;
        }
        return nums.length+1;
    }
}