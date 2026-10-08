class Solution {
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        boolean[][] flag = new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0))
                    res = res || check(board,word,i,j,0,flag);
            }
        }
        return res;
    }
    public boolean check(char[][] arr,String word,int i,int j,int idx,boolean[][] visited){
        if(idx == word.length())
            return true;
        if(i <0 || i>=arr.length || j<0 ||j>=arr[0].length || arr[i][j] != word.charAt(idx) || visited[i][j] )
            return false;
        visited[i][j] = true;
        boolean found = check(arr,word,i-1,j,idx+1,visited)||
                        check(arr,word,i+1,j,idx+1,visited)||
                        check(arr,word,i,j-1,idx+1,visited)||
                        check(arr,word,i,j+1,idx+1,visited);
        visited[i][j] =false;

        return found;
    }
}