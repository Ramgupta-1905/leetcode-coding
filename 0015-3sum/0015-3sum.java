class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> se = new HashSet<>();
        Set<Integer> usedFirst = new HashSet<>();
        for(int i =0;i<nums.length;i++){
             if (usedFirst.contains(nums[i])) {
                continue;
            }

            usedFirst.add(nums[i]);
            int target = 0-nums[i];
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<nums.length;j++){
                List<Integer> list = new ArrayList<>(); 
                if(i==j)
                continue;
               int need = target-nums[j];
                if(set.contains(need)){
                    list.add(nums[j]);
                    list.add(nums[i]);
                    list.add(need);
                    Collections.sort(list);
                    se.add(list);
                }
                else
                    set.add(nums[j]);
            }
        }
        for(List<Integer> x : se)
            res.add(x);
        return res;
    }
}