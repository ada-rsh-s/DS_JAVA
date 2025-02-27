class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets=new ArrayList<>();
        Arrays.sort(nums);

        int numsLength=nums.length;
        
        int i=0,j,k,sum;

        while(i<numsLength-2){
       if(i>0 && nums[i]==nums[i-1]) {
        i++;
        continue;
        }

            j=i+1;
            k=numsLength-1;
            sum=-1;
            while(j<k){
                 if(j>i+1 && nums[j]==nums[j-1]) {
        j++;
        continue;
        }
         if(k<j && nums[k-1]==nums[k]) {
        k--;
        continue;
        }
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                } 
                else if(sum<0)
                    j++;
                else
                    k--;
            }
            i++;
        } 

        return triplets;       
    }
}