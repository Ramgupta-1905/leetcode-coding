class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int k =0;k<=n;k++){
            int count = 0;
            int i = k;
            while (i != 0) {
                i = i & (i - 1);
                count++;
            }
            arr[k] = count;
        }
        return arr;
    }
}