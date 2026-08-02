class Solution {
    public long maxPairStrength(int[] nums) {
        long ans =0;
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                long gcd = gcd(nums[i],nums[j]);
                long num = (long) nums[i]*nums[j];
                long den  = gcd*gcd;
                long ps = num/den;
                ans = Math.max(ps,ans);
            }
        }
        return ans;
    }
    public long gcd(int a ,int b){
        if(b==0)
            return a;
        else return gcd(b,a%b);
    }
}