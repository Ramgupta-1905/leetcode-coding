class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
       if(m*n == r*c){ 
        int[][] res = new int[r][c];
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                int idx = i*n+j;
                res[idx/c][idx%c] = mat[i][j];
            }
        }
        return res;
        }
        return mat;
    }
}