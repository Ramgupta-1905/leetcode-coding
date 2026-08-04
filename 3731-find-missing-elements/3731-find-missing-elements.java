class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int x : nums)
                queue.add(x);
        List<Integer> list = new ArrayList<>();
        int pre = queue.poll();
        while(!queue.isEmpty()){
           int curr = queue.poll();
           int diff = curr-pre;
           if(diff == 1)
                pre = curr;
            else{
                for(int i = pre+1;i<curr;i++)
                    list.add(i);
                pre = curr;
            }
        }
        return list;
    }
}