class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Find the leftmost and rightmost indices of the target
        int left = search(nums, target, true);
        int right = search(nums, target, false);
        return new int[]{left, right};
    }

    public int search(int[] nums, int target, boolean findLeft) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1; // Default to -1 if target is not found

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1; // Search the left half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                // Target found, update idx
                idx = mid;
                if (findLeft) {
                    // Narrow search to the left for first occurrence
                    right = mid - 1;
                } else {
                    // Narrow search to the right for last occurrence
                    left = mid + 1;
                }
            }
        }
        return idx;
    }
}
