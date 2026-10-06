class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean valid = true;
        for(int i =0;i<nums.length-1;i++){
            if(!(nums[i] <= nums[i+1]))
                valid = false;
        }
        boolean valid2 = true;
        for(int i =nums.length-1;i>0;i--){
            if(!(nums[i] <= nums[i-1]))
                valid2 = false;
        }
        return valid||valid2;
    }
}