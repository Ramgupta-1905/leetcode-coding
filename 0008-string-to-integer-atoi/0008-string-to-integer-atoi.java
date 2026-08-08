class Solution {
    public int myAtoi(String s) {
        int sign =1;
        s = s.trim();
        if(s.length() == 0) return 0;
        long res = 0;
        int start =0;
        if(s.charAt(0) == '-'){
                 sign =-1;
                 start = 1;
        }
        else if(s.charAt(0) == '+')
            start =1;
        else if( Character.isDigit(s.charAt(0)))
            start =0;
        else
            return 0;

        for(int i = start;i<s.length();i++){
           if(!Character.isDigit(s.charAt(i)))
                break;

                res = res*10 + (s.charAt(i) -'0');
                
                 if(res * sign > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else if(res* sign < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
        
        }
        res = res*sign;
       
        return (int)res;
            
    }
}