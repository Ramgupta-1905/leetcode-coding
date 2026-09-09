class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(String ch : tokens){
            if(ch.equals("+")|| ch.equals("-") || ch.equals("*") || ch.equals("/"))
             {
                int a = stack.pop();
                int b = stack.pop();
                switch(ch){
                    case "+": {ans = a+b;break;}
                    case "-": {ans = b-a;break;}
                    case "*": {ans = a*b;break;}
                    case "/":{ ans = b/a;break;}
                }
                stack.push(ans);
             } 
             else
             stack.push(Integer.parseInt(ch));  
        }
        return stack.pop();
    }
}