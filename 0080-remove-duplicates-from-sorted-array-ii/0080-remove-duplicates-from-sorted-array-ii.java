class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        int start =2;
        int end =2 ;
        while(end<nums.length){
            if(nums[start-2] != nums[end]){
                nums[start] = nums[end];
                start++;
                end++;
            }
            else{
                end++;
            }
                
        }
        return start;
    }
}