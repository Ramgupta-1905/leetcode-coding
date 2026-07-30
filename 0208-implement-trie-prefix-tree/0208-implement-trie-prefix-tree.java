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
            int ch = word.charAt(i) - 'a';
            if(curr.child[ch] == null)
                curr.child[ch] = new Trie();
            curr = curr.child[ch];
        }
        curr.end = true;
    }
    
    public boolean search(String word) {
        Trie curr = this;
        for(int i =0;i<word.length();i++){
            int ch = word.charAt(i) - 'a';
            if(curr.child[ch] == null)
                return false;
            curr = curr.child[ch];
        }
        return  curr.end;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(int i =0;i<prefix.length();i++){
            int ch = prefix.charAt(i) - 'a';
            if(curr.child[ch] == null)
                return false;
            curr = curr.child[ch];
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