class Solution {
    public int titleToNumber(String columnTitle) {
        int ans =0;
        int size = columnTitle.length();
        for(int i = 0;i<size;i++){
            ans = ans+ ((int)columnTitle.charAt(i) - 64) * (int)Math.pow(26,size-i-1);
        }
        return ans;
    }
}