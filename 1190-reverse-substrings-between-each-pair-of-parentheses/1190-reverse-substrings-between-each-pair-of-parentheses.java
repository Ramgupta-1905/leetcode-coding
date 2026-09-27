class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Stack<Character> temp = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    temp.push(stack.pop());
                }
                stack.pop();
                while(temp.size() != 0){
                    stack.push(temp.remove(0));
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