class Solution {
    public int search(int[] nums, int target) {
        // Start the recursion from 0 to last index
        return help(nums, 0, nums.length - 1, target);
    }

    private int help(int[] nums, int low, int high, int target) {
        // Base Case 1: range is invalid (not found)
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        // Base Case 2: found target
        if (nums[mid] == target) {
            return mid;
        }

        // Recursive cases
        if (nums[mid] > target) {
            return help(nums, low, mid - 1, target);
        } else {
            return help(nums, mid + 1, high, target);
        }
    }
}