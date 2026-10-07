class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length()/k;
        if(s.length()%k !=0)
            n = s.length()/k+1;

        String[] res = new String[n];
        int idx =0;
        for(int i =0;i<n;i++){
            int end = Math.min(idx+k,s.length());
             StringBuilder sb = new StringBuilder(s.substring(idx,end));
            
            while(sb.length() < k)
                sb.append(fill);
            res[i] =  sb.toString();
            idx = idx+k;
        }
        return res;
    }
}