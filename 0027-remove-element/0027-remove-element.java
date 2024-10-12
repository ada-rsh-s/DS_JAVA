class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = length - 1, i = 0;

        while (i<=j) {
            if (nums[j] == val) {
                j--;
                continue;
            } else if(nums[i]==val){
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
                i++;
                j--;
            }else{
                i++;
            }
        }
        return i;
    }
}