class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ind=players.length-1,result=0;
        for(int i=trainers.length-1;i>=0;i--){
            while(ind>=0 && players[ind]>trainers[i]) ind--;
            if(ind>=0 && players[ind]<=trainers[i]){
                result++;
                ind--;
            }
        }
        return result;
    }
}