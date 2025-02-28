class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int numsLength = nums.length, left = 0, right = 0;
        int sum = 0;
        int subArrayLength=Integer.MAX_VALUE;


        while ( right < numsLength) {
             sum+=nums[right];

            while (sum >= target) {
  subArrayLength = Math.min(subArrayLength, right - left + 1);
                sum-=nums[left];
                left++;
            } 
            
            right++;
        
        }

        return subArrayLength==Integer.MAX_VALUE?0:subArrayLength;
    }
}