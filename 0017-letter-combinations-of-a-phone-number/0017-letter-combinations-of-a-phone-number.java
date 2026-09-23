class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,StringBuilder> map = new HashMap<>();
        int ch = 97;
        for(int i = 2;i<10;i++){
            StringBuilder che = new StringBuilder();
            int k = 3;
            if(i == 7 || i == 9)
                k = 4;
            for(int j =0;j<k;j++)
                che.append((char)ch++);
            map.put((char)( '0' + i),che);
        }

        List<String> res = new ArrayList<>();
        for(int i = 0;i<map.get(digits.charAt(0)).length();i++){
            res.add(String.valueOf(map.get(digits.charAt(0)).charAt(i)));
        }
        for(int i =1;i<digits.length();i++){
            StringBuilder list2 = new StringBuilder(map.get(digits.charAt(i)));
            List<String> temp = new ArrayList<>();
            for(int j = 0 ;j<res.size();j++){
                for(int k =0;k<list2.length();k++){
                    temp.add(res.get(j)+ list2.charAt(k));
                }
            }
            res.clear();
            res.addAll(temp);
        }
        return res;
    }
}