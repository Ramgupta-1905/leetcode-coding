class TrieNode{
    TrieNode child[];
    int cnt ;
    TrieNode(){
        child = new TrieNode[26];
        cnt =0;
    }
}

class Solution {
    TrieNode root = new TrieNode();
    public String longestCommonPrefix(String[] strs) {
        for(int i =0;i<strs.length;i++){
            build(strs[i]);
        }
            String sb = strs[0];
            for(int i =0;i<strs.length;i++){
                if(strs[i].length() < sb.length())
                    sb= strs[i];
            }
            if(sb.length() == 0)
                return sb;

            TrieNode temp = root.child[sb.charAt(0)-'a'];
            StringBuilder ans = new StringBuilder();
            if(temp.cnt == strs.length) ans.append(sb.charAt(0));
            else return ans.toString();
            for(int i =1;i<sb.length();i++){
                temp = temp.child[sb.charAt(i)-'a'];
                if(temp == null) return ans.toString();
                if(temp.cnt != strs.length)
                    return ans.toString();
                ans.append(sb.charAt(i));
                
        }
        return ans.toString();
    }
    public void build(String s){
        TrieNode curr =root;
        for(int i =0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            if(curr.child[ch] == null)
                curr.child[ch] = new TrieNode();
            curr= curr.child[ch];
            curr.cnt +=1;
        }
    }
}