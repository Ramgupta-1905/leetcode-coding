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
                if(count>=3){
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(i-1);
                res.add(list);
                }
                start = i;
                can = s.charAt(i);
                count =1;
            }
        }
        if(count>=3){
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(s.length()-1);
                res.add(list);
                }
        return res;
    }
}