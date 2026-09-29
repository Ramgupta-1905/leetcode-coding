class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int start = 0;
        int displace = nums[0];
        int count = 0;
        while(count<nums.length ){
            int curr = nums[start];
            int i = start;
            while(true) 
            { int idx = (i+k)%nums.length;
            displace = nums[idx];
            nums[idx] = curr;
            curr = displace;
            i = idx;
            count++;
            if(i == start)
                break;
            }
            start++;
        }
    }
}