class FrequencyTracker {
    int[] nums;
    int[] freq;
    public FrequencyTracker() {
        nums = new int[100001];
        freq = new int[100001];
    }
    
    public void add(int number) {
        int oldCount = nums[number];
        if(oldCount > 0) freq[oldCount]--;
        nums[number]++;
        freq[nums[number]]++;
    }
    
    public void deleteOne(int number) {
        int oldCount = nums[number];
        if(oldCount == 0) {
            return;
        }
        nums[number]--;
        freq[oldCount]--;
        if(nums[number] > 0) freq[nums[number]]++;
    }
    
    public boolean hasFrequency(int frequency) {
        return freq[frequency] > 0;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */