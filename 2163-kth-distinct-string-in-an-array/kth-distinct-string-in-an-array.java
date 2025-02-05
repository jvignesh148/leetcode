class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String word : arr){
            map.put(word,map.getOrDefault(word,0)+1);
        }   
        int i=0;
        for(String key : arr){
            if(map.get(key)==1){
                i+=1;
                if(i==k){
                    return key;
                }
            }
        }    
        return "";
    }
}