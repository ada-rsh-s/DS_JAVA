class Solution {
    public void sortColors(int[] nums) {
        int length =nums.length;

        int zero_count=0,one_count=0,two_count=0;
        for(int i=0;i<length;i++){
            if(nums[i]==0)
                zero_count++;
            else if(nums[i]==1)
                one_count++;
            else
                two_count++;
        }   

        int i=0; 
        
        while(i<zero_count){
            nums[i]=0;
            i++;
        }


        while(i<zero_count+one_count){
            nums[i]=1;
            i++;
        }


        while(i<zero_count+one_count+two_count){
            nums[i]=2;
            i++;
        }

    }
}