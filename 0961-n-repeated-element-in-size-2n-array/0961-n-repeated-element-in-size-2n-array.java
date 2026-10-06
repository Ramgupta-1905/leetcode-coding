class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            if(set.contains(x))
                    return x;
            else
                set.add(x);
        }
        return -1;
    }
}