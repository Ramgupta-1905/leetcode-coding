class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer> map = new TreeMap<>();
        int start = 0;
        int end = k-1;
        while(end != nums.length){
            Set<Integer> set = new HashSet<>();
            for(int i = start;i<= end;i++){
                set.add(nums[i]);
            }
            for(int x : set){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }
                else{
                    map.put(x,1);
                }
            }
            start++;
            end++;
        }
        int max = -1;
        for(int x :map.keySet()){
            if(map.get(x) == 1)
                max = Math.max(max,x);
        }

        return max;
    }
}