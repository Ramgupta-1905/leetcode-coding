class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int x:nums){
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else
            map.put(x,1);
        }
        for(int x: map.keySet()){
            if(map.get(x) == n)
                ans = x;
        }
        return ans;
    }
}