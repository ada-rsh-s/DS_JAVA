class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int j=2; j <    nums.length; j++) {
            if (nums[k-2] != nums[j]) {
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}