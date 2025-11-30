class LockingTree {
    List<List<Integer>> list = new ArrayList<>();
    boolean[] isLocked;
    int[] owner;
    int[] nums;
    public LockingTree(int[] parent) {
        int n = parent.length;
        isLocked = new boolean[n];
        owner = new int[n];
        nums = new int[n];
        Arrays.fill(owner, -1);
        for(int i = 0; i < n; i++) list.add(new ArrayList<>());
        nums[0] = -1;
        for(int i = 1; i < n; i++) {
            nums[i] = parent[i];
            list.get(parent[i]).add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(isLocked[num]) return false;
        isLocked[num] = true;
        owner[num] = user;
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(owner[num] != user) return false;
        isLocked[num] = false;
        owner[num] = -1;
        return true;
    }
    
    public boolean upgrade(int num, int user) {
        if(isLocked[num] == true || isAnchestorLocked(num) || !isDescendantLocked(num)) return false;
        releaseDescendantLocks(num);
        isLocked[num] = true;
        owner[num] = user;
        return true;
    }

    public boolean isDescendantLocked(int num) {
        for(int c : list.get(num)) {
            if(isLocked[c]) return true;
            if(isDescendantLocked(c)) return true;
        }
        return false;
    }

    public void releaseDescendantLocks(int num) {
        for(int c : list.get(num)) {
            if(isLocked[c]) {
                isLocked[c] = false;
                owner[c] = -1;
            }
            releaseDescendantLocks(c);
        }
    }

    public boolean isAnchestorLocked(int num) {
        if(num == 0) return isLocked[num];
        int index = nums[num];
        while(index != -1) {
            if(isLocked[index]) return true;
            index = nums[index];
        }
        return false;
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */