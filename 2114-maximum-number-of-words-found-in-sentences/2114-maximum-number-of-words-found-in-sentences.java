class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(String s: sentences){
            int space =0;
            for(int i =0;i<s.length();i++){
                if(s.charAt(i) == ' ')
                    space++;
            }
            max = Math.max(max,space+1);
        }
        return max;
    }
}