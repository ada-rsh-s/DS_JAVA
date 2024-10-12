class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2,j=2;
        for (; j <    nums.length; j++) {
            if (nums[k-2] != nums[j]) {
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}