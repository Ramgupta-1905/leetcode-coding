class Solution {
    public int minBitFlips(int x, int y) {
        int xor = x^y;
        int count =0;
        while(xor!=0){
            int res = xor & 1;
            if(res == 1) count++;
            xor = xor >> 1;
        }
        return count;
    }
}