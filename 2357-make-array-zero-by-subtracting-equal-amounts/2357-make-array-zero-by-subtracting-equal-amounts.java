class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0)
            queue.add(nums[i]);
        }
        int count =0;
        int sum =0;
        while(!queue.isEmpty()){
            int x = queue.poll();
            int rest = x- sum;
            if(rest != 0){
                count++;
            }
            sum = sum +rest;
        }
        return count;
    }
}