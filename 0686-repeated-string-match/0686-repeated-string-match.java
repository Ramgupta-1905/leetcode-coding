class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i =0;i<b.length();i++){
            if(a.indexOf(b.charAt(i)) == -1){
                return -1;
            }
        }
        int rep = (b.length() +a.length()-1)/a.length() +1;
        while(count<rep){
            sb.append(a);
            count++;
            if(sb.toString().contains(b)){
                return count;
            }
        }
        return -1;
    }
}