class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count =0;
        while(xor!=0){
            int res = xor & 1;
            if(res == 1) count++;
            xor = xor >> 1;
        }
        return count;
    }
    public String binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%2==0)
                sb.append(0);
            else
                sb.append(1);
            n= n/2;
        }
        return sb.reverse().toString();
    }
}