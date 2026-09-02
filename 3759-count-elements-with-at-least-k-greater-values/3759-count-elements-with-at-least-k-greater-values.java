class Solution {
    public int countElements(int[] nums, int k) {
           if (k == 0)
            return nums.length;

        if (k >= nums.length)
            return 0;

        Arrays.sort(nums);

        int target = nums[nums.length - k];

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target)
                end = mid;
            else
                start = mid + 1;
        }

        return start;
    }
}