class Solution {
    public int arraySign(int[] nums) {
        int cnt =0;
        for(int x :nums){
            if(x ==0)
                return 0;
            if(x<0)
                cnt++;
        }
        return signFunc(cnt);
    }
    public int signFunc(int num){
        if(num%2 !=0) return -1;
        else return 1;
    }
}