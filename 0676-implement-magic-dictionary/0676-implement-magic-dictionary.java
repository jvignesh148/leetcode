class MagicDictionary {
    class TrieNode{
        TrieNode[] children;
        boolean isEndOfWord;
        TrieNode(){
            children=new TrieNode[26];
            isEndOfWord=false;
        }
    }
    private TrieNode root;
    public MagicDictionary() {
        root=new TrieNode();
    }
    
    public void buildDict(String[] dictionary) {
        for(String s : dictionary){
            TrieNode curr=root;
            for(char c : s.toCharArray()){
                if(curr.children[c-'a']==null) curr.children[c-'a']=new TrieNode();
                curr=curr.children[c-'a'];
            }
            curr.isEndOfWord=true;
        }
    }
    
    public boolean search(String searchWord) {
        return dfs(root, searchWord.toCharArray(), 0, false);
    }

    private boolean dfs(TrieNode node, char[] word, int index, boolean modified) {
        if (node == null) return false;
        if (index == word.length) {
            return modified && node.isEndOfWord;
        }
        int charIndex = word[index] - 'a';
        for (int i = 0; i < 26; i++) {
            if (node.children[i] == null) continue;
            if (i == charIndex) {
                if (dfs(node.children[i], word, index + 1, modified)) return true;
            } else if (!modified) {
                if (dfs(node.children[i], word, index + 1, true)) return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */