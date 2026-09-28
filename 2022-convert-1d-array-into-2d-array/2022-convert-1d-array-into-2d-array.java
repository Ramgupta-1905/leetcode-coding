class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) {
            int[][] res = new int[0][0];
            return res;
        } 
        int[][] res = new int[m][n];
        int row = 0;
        int col =0;
        for(int x: original){
            res[row][col] = x;
            if(col == n-1){
                row++;
                col=0;
            }
            else
                col++;
        }
        return res;
    }
}