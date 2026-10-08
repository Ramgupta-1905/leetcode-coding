class Solution {
    public int maxScore(String s) {
        int leftzero = 0;
        int rightone = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1')
                rightone +=1;
        }
        int res = 0;
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i) == '0'){
                leftzero++;
            }
            else
                rightone--;
            res = Math.max(res,rightone+leftzero);
        }
        return res;
    }
}