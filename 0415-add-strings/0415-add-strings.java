class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int curr1 = num1.length()-1 ;
        int curr2 = num2.length()-1;
        int n1 = 0;
        int n2 = 0;
        StringBuilder sb = new StringBuilder();
        while(curr1 >=0 || curr2 >=0){
            if(curr1 >=0)
                n1 = num1.charAt(curr1) -'0';
            else
                n1 =0;
            if(curr2 >=0)
                n2 = num2.charAt(curr2) -'0';
            else
                n2 =0;
                int sum = n1+n2+carry;
                carry = sum/10;
                sb.append((char)('0' + sum%10));
                curr1--;
                curr2--;
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}