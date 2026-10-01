class Solution {
    public int hammingDistance(int x, int y) {
        String num1 = binary(x);
        String num2 = binary(y);
        while (num1.length() < num2.length())
            num1 = "0" + num1;

        while (num2.length() < num1.length())
            num2 = "0" + num2;
            
        int ptr1 = num1.length()-1;
        int ptr2 = num2.length()-1;
        int count = 0;

        while(ptr1>=0 && ptr2 >=0){
            if(num1.charAt(ptr1) != num2.charAt(ptr2))
                count++;
             ptr1--;
             ptr2--;
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