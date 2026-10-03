class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i =0 ;i<words.length;i++){
            for(int j =0;j<words.length;j++){
                if(i==j)
                    continue;
                if(words[j].contains(words[i]) && !set.contains(words[i])){
                    list.add(words[i]);
                    set.add(words[i]);
                }
            }
        }
        return list;
    }
}