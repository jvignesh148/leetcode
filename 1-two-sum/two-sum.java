class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };

                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int[] nums = new int[100];
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println('[' + result[0] + ',' + result[1] + ']');
        } else {
            System.out.println("Not found");
        }
    }
}