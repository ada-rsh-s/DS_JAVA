class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int jump = 0;

        for (int i = 0; i < length ; i++) {
            if(jump<0)
             return false;
            else if(nums[i]>=jump)
             jump = nums[i];  
            jump--;
          
        }
         return true;
    }
}