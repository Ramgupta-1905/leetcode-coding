class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice=0;
        int bob =0;
        for(int x: aliceSizes)
            alice +=x;
        for(int x: bobSizes)
            bob +=x;

        int need = (bob-alice)/2;
        Arrays.sort(bobSizes);
        int res[] = new int[2];
        for(int x: aliceSizes){
            int ele = need+x;
            int ele2= search(bobSizes,ele);
            if(ele2!=-1){
                return new int[]{x, ele2};
            }
        }
        return new int[0];
    }
    public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return nums[mid];
        } 
        else if (nums[mid] < target) {
            left = mid + 1;
        } 
        else {
            right = mid - 1;
        }
    }

    return -1;
}
}