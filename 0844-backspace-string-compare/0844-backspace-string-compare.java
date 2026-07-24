class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st1.isEmpty() && ch == '#')
                st1.pop();
            else if (ch == '#')
                continue;
            else
                st1.push(ch);
        }
        for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!st2.isEmpty() && ch == '#')
                st2.pop();
            else if (ch == '#')
                continue;
            else
                st2.push(ch);
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i =0;i<st1.size();i++){
                sb1.append(st1.get(i));
        }
        for(int i =0;i<st2.size();i++){
                sb2.append(st2.get(i));
        }
        
        return (sb1.toString().equals(sb2.toString())) ? true : false;
    }
}