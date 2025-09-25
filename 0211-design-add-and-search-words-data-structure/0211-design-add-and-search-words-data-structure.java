class WordDictionary {
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        TrieNode(){
            children=new TrieNode[26];
            isEnd=false;
        }
    }
    TrieNode root=new TrieNode();
    public WordDictionary() {
    }
    
    public void addWord(String word) {
        TrieNode curr=root;
        for(char c : word.toCharArray()){
            if(curr.children[c-'a']==null) curr.children[c-'a']=new TrieNode();
            curr=curr.children[c-'a'];
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        return dfsSearch(word,0,root);
    }
    public boolean dfsSearch(String word,int index,TrieNode node){
        if(index==word.length()) return node.isEnd;

        if(word.charAt(index)=='.'){
            for(int i=0;i<26;i++){
                if(node.children[i]!=null){
                    if(dfsSearch(word,index+1,node.children[i])) return true;
                }
            }
            return false;
        }
        else{
            if(node.children[word.charAt(index)-'a']==null) return false;
            return dfsSearch(word,index+1,node.children[word.charAt(index)-'a']);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */