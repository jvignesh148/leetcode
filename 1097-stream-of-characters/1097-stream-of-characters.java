class StreamChecker {
    static class Trie{
        Trie[] children = new Trie[26];
        boolean isEnd;
    }
    int maxLen = 0;
    Trie root = new Trie();
    StringBuilder sb = new StringBuilder();
    public StreamChecker(String[] words) {
        for(String s : words) {
            maxLen = Math.max(maxLen, s.length());
            insert( reverse( s ));
        }
    }
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public void insert(String s){
        Trie node = root;
        for(char c : s.toCharArray()){
            if(node.children[c-'a'] == null ) node.children[c-'a'] = new Trie();
            node = node.children[c-'a'];
        }
        node.isEnd=true;
    }
    public boolean query(char letter) {
        sb.append(letter);
        Trie node = root;
        for(int i = sb.length() - 1, steps = 0; i >= 0 && steps<maxLen; i--, steps++) {
            if(node.children[sb.charAt(i) - 'a'] == null) return false;
            node = node.children[sb.charAt(i) - 'a'];
            if(node.isEnd) return true;
        }
        return false;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */