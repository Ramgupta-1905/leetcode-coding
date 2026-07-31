class Solution {
    public int minimumPushes(String word) {
        int[] letters = new int[26];
        for(int i =0;i<word.length();i++){
            letters[word.charAt(i)-'a'] +=1;
        }
        Arrays.sort(letters);
        int sum =0;
        int rank=0;
        for(int i =letters.length-1;i>=0;i--){
            sum = sum +letters[i]*((rank/8)+1);
            rank++;
        }
        return sum ;
    }
}