class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0, currentEnd = 0, fuel = 0;
        
        for(int i=0;i<n-1;i++){
            fuel=Math.max(fuel,i+nums[i]);
            if(i==currentEnd){
                currentEnd=fuel;
                jumps++;
            }
        }
        return jumps;

    }
}