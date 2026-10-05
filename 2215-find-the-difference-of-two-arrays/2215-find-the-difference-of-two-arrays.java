class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int x: nums1)
            set1.add(x);
        for(int x: nums2)
            set2.add(x);
        for(int x: set1){
            if(!set2.contains(x))
                list1.add(x);
        }
         for(int x: set2){
            if(!set1.contains(x))
                list2.add(x);
        }
        res.add(list1);
        res.add(list2);
        return res;
    }
}