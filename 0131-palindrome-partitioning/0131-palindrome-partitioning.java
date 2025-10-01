class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(String s, int ind, List<String> list, List<List<String>> result){
        if(ind==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                list.add(s.substring(ind,i+1));
                backtrack(s,i+1,list,result);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}