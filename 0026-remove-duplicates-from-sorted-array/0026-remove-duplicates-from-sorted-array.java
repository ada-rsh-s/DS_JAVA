class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i = 0,j=1;
        for (; j < length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}