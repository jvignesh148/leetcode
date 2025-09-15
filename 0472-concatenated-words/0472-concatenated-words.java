class Solution {
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        TrieNode(){
            children=new TrieNode[26];
            isEnd=false;
        }
    }
    private TrieNode root=new TrieNode();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        List<String> list=new ArrayList<>();
        for(String s : words) {
            if(canConfirm(s,0,0)) list.add(s);
            else insert(s);
        }
        return list;
    }
    public void insert(String s){
        TrieNode curr=root;
        for(char c : s.toCharArray()){
            if(curr.children[c-'a']==null) curr.children[c-'a']=new TrieNode();
            curr=curr.children[c-'a'];
        }
        curr.isEnd=true;
    }
    public boolean canConfirm(String s,int ind, int count){
        TrieNode curr=root;
        for(int i=ind;i<s.length();i++){
            char c = s.charAt(i);
            if(curr.children[c-'a']==null) return false;
            curr=curr.children[c-'a'];
            if(curr.isEnd){
                if(i==s.length()-1) return count>=1;
                if(canConfirm(s,i+1,count+1)) return true;
            }
        }
        return false;
    }
}