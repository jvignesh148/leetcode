class Solution {
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(".".repeat(n));
        }
        isPossible(list,0,n);
        return result;
    }
    public void isPossible(List<String> list,int n,int size){
        if(n==size){
            result.add(new ArrayList<>(list));
            return;
        } 
        for(int i=0;i<size;i++){
            if(isSafe(list,n,i,size)) {
                StringBuilder sb=new StringBuilder(list.get(n));
                sb.setCharAt(i,'Q');
                list.set(n,sb.toString());
                isPossible(list,n+1,size);
                sb.setCharAt(i,'.');
                list.set(n,sb.toString());
            }
        }
       
    }
    public boolean isSafe(List<String> list,int n,int m,int size){
        for(int i=0;i<n;i++){
            if(list.get(i).charAt(m)=='Q') return false;
        }
        for(int i=n-1,j=m-1;i>=0 && j>=0;i--,j--){
            if(list.get(i).charAt(j)=='Q') return false;
        }
        for(int i=n-1,j=m+1; i>=0 && j<size;i--,j++){
            if(list.get(i).charAt(j)=='Q') return false;
        }
        return true;
    }
}