class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int st=0,la=skill.length-1;
        long res=0;
        int target = skill[st] + skill[la];
        while(st<la){
            if (skill[st] + skill[la] != target) return -1;
            res+=skill[st]*skill[la];
            st++;
            la--;
        }
        return res;
    }
}