class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int dept = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(dept !=1)
                    sb.append(s.charAt(i));
                dept--;
            }
            else{
                if(dept != 0)
                    sb.append(s.charAt(i));
                dept++; 
            }
        }
        return sb.toString();
    }
}