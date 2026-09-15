class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum =0;
        int j =1;
        for(int i =0;i<n;i++){
            if(n%j++ ==0)
                sum = sum+nums[i]*nums[i];
        }
        return sum;
    }
}