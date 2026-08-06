class Solution {
    public int removeDuplicates(int[] nums) {
        int start =0;
        int end = 0;
        int cnt =2;
        int can = nums[start];
        while(end<nums.length){
            if(nums[end] == can && cnt >0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end++;
                cnt--;
            }
            else if(nums[end] == can && cnt ==0){
                end++;
            }
            else{
                can = nums[end];
                cnt = 2;
            }
        }
        return start;
    }
}