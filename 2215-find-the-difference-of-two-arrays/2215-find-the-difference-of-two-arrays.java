class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int x: nums1) set1.add(x);
        for(int x: nums2) set2.add(x);

        Set<Integer> set1copy = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(set1copy);

        res.add(new ArrayList<>(set1));
        res.add(new ArrayList<>(set2));
        return res;
    }
}