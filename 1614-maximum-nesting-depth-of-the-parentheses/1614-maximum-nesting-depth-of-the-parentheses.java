class Solution {
    public int maxDepth(String s) {
        int curr = 0;
        int max = 0;
        for(int i= 0;i<s.length();i++){
            if(s.charAt(i) == '(')
                curr +=1;
            if(s.charAt(i) == ')')
                curr -=1;
            max = Math.max(curr,max);
        }
        return max;
    }
}