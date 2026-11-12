class Solution {
    public int[] rearrangeArray(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int x :nums){
            if(x>0)
                pos.add(x);
            else
                neg.add(x);
        }
        int cnt = 0;
        for(int i=0;i<nums.length;i+=2){
            nums[i] = pos.get(cnt);
            nums[i+1] = neg.get(cnt);
            cnt++;
        }
        return nums;
    }
}