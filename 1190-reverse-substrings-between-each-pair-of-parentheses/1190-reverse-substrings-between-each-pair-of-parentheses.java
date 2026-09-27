class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
                while(sb.length() != 0){
                    stack.push(sb.charAt(0));
                    sb.deleteCharAt(0);
                }
            }
            else
                stack.push(s.charAt(i));
        }
        for(int i= 0;i<stack.size();i++)
            sb.append(stack.get(i));
        return sb.toString();
    }
}