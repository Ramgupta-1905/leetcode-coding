class Solution {
    public boolean checkOnesSegment(String s) {
        int count =0;
        int segment =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1')
                count++;
            if(s.charAt(i) == '0'){
                if(count!=0)
                segment++;
                count=0;
            }
        }
        if(count !=0)
            segment++;
        if(segment<2)
            return true;
        return false;
    }
}