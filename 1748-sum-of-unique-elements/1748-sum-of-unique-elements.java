class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int sum =0;
        for(int x:nums){
            if(freq[x] == 1)
                sum-= x;
            else  if(freq[x] >=2)
                continue;
            else{
                sum = sum+x;
            }
            freq[x]+=1;
        }
        return sum;
    }
}