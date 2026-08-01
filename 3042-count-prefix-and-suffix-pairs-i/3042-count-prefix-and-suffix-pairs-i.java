class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count =0;
        for(int i =0;i<words.length;i++){
            String pre = words[i];
            for(int j =i+1;j<words.length;j++){
                if(words[j].startsWith(pre) && words[j].endsWith(pre))
                    count++;
            }
        }
        return count;
    }
}