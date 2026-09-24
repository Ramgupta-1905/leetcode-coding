class Solution {
    public int trailingZeroes(int n) {
        int t = 1;
        int count = 0;
        while(Math.pow(5,t)<=n){
            count = count+(int)(n/(int)Math.pow(5,t++));
        }
        return count;
    }
}