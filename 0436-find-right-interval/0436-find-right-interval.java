class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int temp[][] = new int[n][2];
        for(int i =0;i<intervals.length;i++){
            temp[i][0] = intervals[i][0];
            temp[i][1] = i;
        }
        Arrays.sort(temp,(a,b)->Integer.compare(a[0],b[0]));
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i = 0;i<n;i++){
            int can = intervals[i][1];
            int start =0;
            int end = temp.length-1;
            int ans = -1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(temp[mid][0] >= can){
                    ans = temp[mid][1];
                    end = mid-1;
                }
                else
                    start = mid+1;
            }
            res[i] = ans;
        }
        return  res;
    }
}