class Solution {
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        TrieNode(){
            children=new TrieNode[26];
            isEnd=false;
        }
    }
    TrieNode root=new TrieNode();
    String result="";
    public String longestWord(String[] words) {
        for(String word : words){
            insert(word);
        }
        dfs(root,new StringBuilder());
        return result;
    }
    public void insert(String s){
        TrieNode curr=root;
        for(char c : s.toCharArray()){
            if(curr.children[c-'a']==null) curr.children[c-'a']=new TrieNode();
            curr=curr.children[c-'a'];
        }
        curr.isEnd=true;
    }
    public void dfs(TrieNode node, StringBuilder sb){
        if(node==null || (sb.length()>0 && !node.isEnd)) return;
        String temp=sb.toString();
        if(temp.length()>result.length() || (temp.length()==result.length() && temp.compareTo(result)<0)){
            result=temp;
        }
        for(int i=0;i<26;i++){
            if(node.children[i]!=null){
                sb.append((char) (i+'a'));
                dfs(node.children[i],sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}