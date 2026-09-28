class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col  =0;
       if(m*n == r*c){ 
        int[][] res = new int[r][c];
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                res[row][col] = mat[i][j];
                if(col == c-1){
                    col =0;
                    row++;
                    }
                else{
                    col++;
                }
            }
        }
        return res;
        }
        return mat;
    }
}