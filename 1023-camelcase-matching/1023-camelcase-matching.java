class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for(int i =0;i<queries.length;i++){
            String s = queries[i];
            int j =0;
            int k = 0;
            while(k < s.length()){
                if(j<pattern.length() && pattern.charAt(j) == s.charAt(k)){
                    j++;
                    k++;
                }
                else if(Character.isUpperCase(s.charAt(k))){
                            break; 
                }
                else
                    k++;
            }
            if(k == s.length() && j == pattern.length())
                res.add(true);
            else
                res.add(false);
            
        }
        return res;
    }
}