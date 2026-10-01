class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        String num = binary(xor);
        int count =0;
        for(int i =0;i<num.length();i++){
            if(num.charAt(i) == '1')
                count++;
        }
        return count;
    }
    public String binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%2==0)
                sb.append(0);
            else
                sb.append(1);
            n= n/2;
        }
        return sb.reverse().toString();
    }
}