class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> map = new HashMap<>();
        int c = 65;
        for(int i =0;i<26;i++){
            map.put((char)c++,i+1);
        }
        int ans =0;
        int size = columnTitle.length();
        for(int i = 0;i<size;i++){
            ans = ans+ ((int)columnTitle.charAt(i) - 64) * (int)Math.pow(26,size-i-1);
        }
        return ans;
    }
}