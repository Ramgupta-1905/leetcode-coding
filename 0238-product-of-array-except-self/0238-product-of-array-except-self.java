class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;

        int zeroes =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0)
                zeroes++;
        }
        if(zeroes>1){
            for(int i =0;i<nums.length;i++){
                nums[i] =0;
            }
            return nums;
            }

        for(int i =0;i<nums.length;i++){
           mul =  mul*nums[i];
        }
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                int mul2 =1;
                for(int j =0;j<nums.length;j++){
                    if(nums[j] == 0)
                        continue;
                    mul2 = mul2 * nums[j];
                }
                res[i]= mul2;
            }
            else
             res[i] = mul/nums[i];
        }
        return res;
    }
}