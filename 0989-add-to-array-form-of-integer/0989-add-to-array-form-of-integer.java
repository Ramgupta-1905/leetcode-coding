class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int carry = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--){
            int add = nums[i]+k%10+carry;
            res.add(add%10);
            carry = add/10;
            k = k/10;
        }
        if(carry !=0)
            k = k+carry;
        while(k>0){
            res.add(k%10);
            k = k/10;
        }
        return res.reversed();
    }
}