class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        int max =0;
        for(int[] x : items1){
            map1.put(x[0],x[1]);
            if(x[0]>max)
                max = x[0];
        }
        for(int[] x : items2){
            map2.put(x[0],x[1]);
            if(x[0]>max)
                max = x[0];
        }
        for(int i = 1;i<=max;i++){
            if(map1.containsKey(i) && map2.containsKey(i)){
                res.add(Arrays.asList(i,map1.get(i) +map2.get(i)));
            }
            else if(map1.containsKey(i)){
                res.add(Arrays.asList(i, map1.get(i)));
            }
            else if(map2.containsKey(i)){
                res.add(Arrays.asList(i, map2.get(i)));
            }
        }
    return res;
    }
}