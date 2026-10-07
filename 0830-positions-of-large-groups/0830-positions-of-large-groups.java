class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;
        char can = s.charAt(0);
        int count =1;
        for(int i =1;i<s.length();i++){
            if(can == s.charAt(i)){
                count++;
            }
            else{
                if(count>=3)
                    res.add(Arrays.asList(start, i - 1));
                start = i;
                can = s.charAt(i);
                count =1;
            }
        }
        if(count>=3)
            res.add(Arrays.asList(start, s.length()-1));
        return res;
    }
}