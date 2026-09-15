class Solution {
    public boolean judgeSquareSum(int c) {
        int end= (int)Math.sqrt(c);
        for(int i =0;i<=end;i++){
            int t = c-i*i;
            int a = (int)Math.sqrt(t);
            if(a*a == t)
                return true;
        }
        return false;
    }
}