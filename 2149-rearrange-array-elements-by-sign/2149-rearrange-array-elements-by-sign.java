class Solution {
    public int[] rearrangeArray(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        int index = 0;
        int pos = 0;
        int neg =0;
        for(int i = 0;i<nums.length;i++){
            int can = nums[i];
            if(nums[i] >0){
                res[pos*2] = can;
                pos++;
            }
            else{
                res[neg*2+1] = can;
                neg++;
            }
        }
        return res;
    }
}