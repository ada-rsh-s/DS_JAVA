class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int low = 0, high = length - 1, mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }
}