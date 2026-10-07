class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length()/k;
        if(s.length()%k !=0)
            n = s.length()/k+1;

        String[] res = new String[n];

        int idx =0;
        int i =0;
        while(idx+k <= s.length()){
            res[i++] = s.substring(idx,idx+k);
            idx = idx+k; 
        }
        if(idx != s.length()){
            StringBuilder sb = new StringBuilder(s.substring(idx,s.length()));
            while(k-sb.length() !=0)
                sb.append(fill);
            res[res.length-1] = sb.toString();
        }
        return res;
    }
}