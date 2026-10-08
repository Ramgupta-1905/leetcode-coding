class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        int row1 = s.charAt(1) -'0';
        int row2 = s.charAt(4) -'0';
        for(char i = s.charAt(0);i<=s.charAt(3);i++){
            for(int j = row1;j<=row2;j++){
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(j);
                res.add(sb.toString());
            }
        }
        return res;
    }
}