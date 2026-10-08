class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i =0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j =0;j<n;j++){
                if(set.contains(matrix[i][j]))
                    return false;
                set.add(matrix[i][j]);
            }
        }
        for(int j =0;j<n;j++){
            Set<Integer> set = new HashSet<>();
            for(int i =0;i<n;i++){
                if(set.contains(matrix[i][j]))
                    return false;
                set.add(matrix[i][j]);
            }
        }
        return true;
    }
}