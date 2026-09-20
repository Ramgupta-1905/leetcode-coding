class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftpr =1;
        int rightpr = 1;
        int[] res = new int[nums.length];
        for(int i = res.length-1;i>=0;i--){
            res[i] = rightpr;
            rightpr = rightpr*nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            res[i] = res[i]*leftpr;
            leftpr = leftpr*nums[i];
        }
        return res;
    }
}