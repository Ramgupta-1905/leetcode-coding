class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();

        for(int[] x : items1){
            map.put(x[0],x[1]);
        }
        for(int[] x : items2){
            map.put(x[0],map.getOrDefault(x[0],0)+x[1]);
        }
        for(int x:map.keySet()){
            res.add(Arrays.asList(x,map.get(x)));
        }
    return res;
    }
}