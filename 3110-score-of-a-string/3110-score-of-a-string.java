class Solution {
    public int scoreOfString(String s) {
        int prev = (int)s.charAt(0);
        int sum =0;
        for(int i =1;i<s.length();i++){
            int curr = (int)s.charAt(i);
            sum = sum +Math.abs(s.charAt(i) - s.charAt(i - 1));
            prev = curr;
        }
        return sum;
    }
}