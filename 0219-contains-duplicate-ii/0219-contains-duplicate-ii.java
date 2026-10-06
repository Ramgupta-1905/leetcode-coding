class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int start = 0;
        int end = 0;
        Set<Integer> set = new HashSet<>();
        while(end <nums.length && end<=k){
                if(set.contains(nums[end]))
                    return true;
                set.add(nums[end]);
                end++;
            }
        while(end < nums.length){
                set.remove(nums[start]);
                if(set.contains(nums[end]))
                    return true;
                set.add(nums[end]);
                start++;
                end++;
        }
        return false;
    }
}