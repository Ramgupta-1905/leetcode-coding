class Solution {
    public String largestOddNumber(String num) {
        int end = -1;
        for(int i = num.length()-1;i>=0;i--){
            int n = num.charAt(i) - '0' ;
            if(n%2!=0){
                end =i+1;
                break;
            }
        }
        if(end == -1)
            return "";
        return num.substring(0,end);
    }
}