class Solution {
    public void rotate(int[] nums, int k) {
        int length =nums.length;
       k%=length;
       rev(nums,0,length-1);
       rev(nums,0,k-1);
       rev(nums,k,length-1);
    }
      public void rev (int[] nums,int start,int end){
            while(start<end){
                nums[start]=nums[start]+nums[end];
                nums[end]=nums[start]-nums[end];
                nums[start]=nums[start]-nums[end];
                start++;
                end--;
            }     
        }
}