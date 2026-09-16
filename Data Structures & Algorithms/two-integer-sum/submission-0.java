class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] value = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    value = new int[] {i, j};
                    break;
                }
            }
        }
        return value;
    }
}
