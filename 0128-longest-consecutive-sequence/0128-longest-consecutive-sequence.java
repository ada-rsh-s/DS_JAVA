
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int consecutiveLength = 1;
        int maxConsecutiveLength = 1;
        if(nums.length==0) return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                consecutiveLength++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                maxConsecutiveLength = Math.max(maxConsecutiveLength, consecutiveLength);
                consecutiveLength = 1;
            }
        }
        return Math.max(maxConsecutiveLength, consecutiveLength);
    }
}