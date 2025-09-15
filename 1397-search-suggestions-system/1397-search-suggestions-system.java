class Solution {
    class TrieNode{
        TrieNode[] children;
        List<String> word;
        TrieNode(){
            children=new TrieNode[26];
            word=new ArrayList<>();
        }
    }
    private TrieNode root=new TrieNode();
    public void insert(String s){
        TrieNode curr=root;
        for(char c : s.toCharArray()){
            if(curr.children[c-'a']==null) curr.children[c-'a']=new TrieNode();
            curr=curr.children[c-'a'];
            if(curr.word.size()<3) curr.word.add(s);
        }       
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        for(String w : products) insert(w);
        List<List<String>> list=new ArrayList<>();
        TrieNode node=root;
        for(char c : searchWord.toCharArray()){
            if(node!=null) node=node.children[c-'a'];
            if(node==null) {
                while(list.size()<searchWord.length()) list.add(new ArrayList<>());
                return list;
            }
            list.add(node.word);
        }
        return list;
    }
}