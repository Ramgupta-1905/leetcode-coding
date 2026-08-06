class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;i<=100;i++){
            int mul =1;
            int m = i;
            while(m>0){
                mul = mul* (m%10);
                m = m/10;
            }
            if(mul % t ==0)
                return i;
        }
        return -1;
    }
}