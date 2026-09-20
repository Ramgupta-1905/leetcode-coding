class Solution {
    public int reverseDegree(String s) {
        int rdeg =0;
        for(int i =0;i<s.length();i++)
        {
            int ch = s.charAt(i)-'a'+1;
            int rch = 26-ch+1;
            rdeg = rdeg + rch*(i+1);
        }
        return rdeg;
    }
}