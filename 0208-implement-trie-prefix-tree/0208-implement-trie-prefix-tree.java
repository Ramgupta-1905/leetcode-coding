class Trie {
    Trie[] child;
    boolean end ;
    public Trie() {
        child = new Trie[26];
        end = false;
    }
    
    public void insert(String word) {
        Trie curr = this;
        for(int i =0;i<word.length();i++){
            if(curr.child[word.charAt(i) - 'a'] == null)
                curr.child[word.charAt(i) - 'a'] = new Trie();
            curr = curr.child[word.charAt(i)-'a'];
        }
        curr.end = true;
    }
    
    public boolean search(String word) {
        Trie curr = this;
        for(int i =0;i<word.length();i++){
            if(curr.child[word.charAt(i) - 'a'] == null)
                return false;
            curr = curr.child[word.charAt(i)-'a'];
        }
        return  curr.end;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(int i =0;i<prefix.length();i++){
            if(curr.child[prefix.charAt(i) - 'a'] == null)
                return false;
            curr = curr.child[prefix.charAt(i)-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */