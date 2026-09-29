class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int res[] = new int[intervals.length];
        for(int i =0;i<intervals.length;i++){
            int can = intervals[i][1];
            int ans = -1;
            int best = Integer.MAX_VALUE;
            for(int j =0;j<intervals.length;j++){
                if(intervals[j][0] >= can){
                    if(best > intervals[j][0]){
                        ans = j;
                        best = intervals[j][0];
                    }
                }
            }
            res[i] = ans;
        }
        return  res;
    }
}