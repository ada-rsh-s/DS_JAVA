class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result,1);

        for(int i=1;i<nums.length;i++){
            result[i]= result[i-1]*nums[i-1];
        }
      
        int rightproduct=1;
        for(int i=nums.length-2;i>=0;i--){
            rightproduct*=nums[i+1];
            result[i]*=rightproduct;
        }
        return result;
    }
}