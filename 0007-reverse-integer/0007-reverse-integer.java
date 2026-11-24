class Solution {
    public int reverse(int x) {
        long res = 0;
        int sign =1;
        if(x<0){
            sign = -1;
            x = -x;
        }
        while(x>0){
            int rem = x%10;
            res = res*10+rem;
            if(res > Integer.MAX_VALUE)
                return 0;
            x = x/10;
        }
        return sign * (int)res;
    }
}