class Solution {
    public int titleToNumber(String columnTitle) {
        int ans =0;
        int size = columnTitle.length();
        for(int i = 0;i<size;i++){
            ans = ans * 26 +((int)columnTitle.charAt(i) - 64) ;
        }
        return ans;
    }
}