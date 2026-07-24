class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
       for(int x : nums2){
            while(!stack.isEmpty() && stack.peek() < x){
                map.put(stack.peek(),x);
                stack.pop();
            }
                stack.push(x);
       }
       for(int i = 0;i<nums1.length;i++){
            res[i] = map.getOrDefault(nums1[i],-1);
       }
       return res;
    }
}