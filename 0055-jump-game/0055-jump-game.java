class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        if(length==1)
        return true;

        int jump=nums[0];
        for(int i=0;i<length-1;i++){
            jump--;
            if(nums[i]>=jump &&jump>=0)
            jump=nums[i];
        }
        if(jump>=1)        
        return true;
        else
        return false;
        
    }
}