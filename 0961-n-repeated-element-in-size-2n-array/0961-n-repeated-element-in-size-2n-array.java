class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
                if(map.get(x) == n)
                    return x;
            }
            else
            map.put(x,1);
        }
        return -1;
    }
}