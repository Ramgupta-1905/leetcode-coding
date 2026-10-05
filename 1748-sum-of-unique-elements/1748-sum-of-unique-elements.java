class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum =0;
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else
                map.put(x,1);
        }
        for(int x:map.keySet()){
            if(map.get(x) == 1)
                sum +=x;
        }
        return sum;
    }
}