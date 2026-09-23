class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,List<Character>> map = new HashMap<>();
        int ch = 97;
        for(int i = 2;i<10;i++){
            List<Character> list = new ArrayList<>();
            int k = 3;
            if(i == 7 || i == 9)
                k = 4;
            for(int j =0;j<k;j++)
                list.add((char)ch++);
            map.put((char)( '0' + i),list);
        }

        List<String> res = new ArrayList<>();
        for(int i = 0;i<map.get(digits.charAt(0)).size();i++){
            res.add(String.valueOf(map.get(digits.charAt(0)).get(i)));
        }
        for(int i =1;i<digits.length();i++){
            List<Character> list2 = map.get(digits.charAt(i));
            List<String> temp = new ArrayList<>();
            for(int j = 0 ;j<res.size();j++){
                for(int k =0;k<list2.size();k++){
                    temp.add(res.get(j)+ list2.get(k));
                }
            }
            res.clear();
            res.addAll(temp);
        }
        return res;
    }
}