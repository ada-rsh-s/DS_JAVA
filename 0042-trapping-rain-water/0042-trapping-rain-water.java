class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int l=0,r=length-1;
        int sum = 0,ml=0,mr=length-1;
        while(l<r){
            
            if(height[ml]<=height[mr]){
                sum+=height[ml]-height[l];
                l++;
                if(height[l]>height[ml])
                ml=l;
            }else{
                sum+=height[mr]-height[r];
                r--;
                if(height[r]>height[mr])
                mr=r;
            }
        }
       
        return sum;
    }
}