class Solution {
    public int countPrimes(int n) {
        boolean[] prime=new boolean[n];
        for(int i=0;i<prime.length;i++) prime[i]=true;
        int count=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(prime[i]==true){
                for(int j=(i*i);j<prime.length;j=j+i){
                    prime[j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==true) c+=1;
        }
        return c;
    }
}