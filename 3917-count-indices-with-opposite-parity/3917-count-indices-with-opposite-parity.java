class Solution {
    public int[] countOppositeParity(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i] %2==0){
                nums[i] = odd;
                even++;
            }
            else{
                nums[i] = even;
                odd++;
            }
        }
        return nums;
    }
}