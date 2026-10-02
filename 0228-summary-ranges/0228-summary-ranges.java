class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        int start = 0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] +1 != nums[i+1] ){
                int end = i;
                if(start == end)
                    res.add("" + nums[i]);
                else
                 res.add(nums[start] +"->" + nums[end]);
                start = i+1;
            }
        }
         if(start == nums.length-1)
                res.add("" + nums[start]);
            else
                res.add(nums[start] +"->" + nums[nums.length-1]);
        return res;
    }
}