class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = nums.length *(nums.length+1)/2;
        int sum = 0;
        for(int x : nums){
            sum +=x;
        }
        return totalSum -sum;
    }
}