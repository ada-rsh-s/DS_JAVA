class Solution {
    public int maxArea(int[] height) {
        int heightLength = height.length;
        int i = 0, j = heightLength-1;
        int maxArea = 0;

        
        while(i<j){
            int shorterWall = Math.min(height[i], height[j]);
            int value = (j-i)*shorterWall;
             if (maxArea < value) {
                 maxArea = value;
             }
             if(height[i]<=height[j])
                i++;
             else
                j--;
             
        }
return maxArea;

        // while (i < heightLength - 1) {
        //     j = i + 1;
        //     while (j < heightLength) {
        //         int shorterWall = Math.min(height[i], height[j]);
        //         int value = (j-i)*shorterWall;
        //         if (maxArea < value) {
        //             maxArea = value;
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        
    }
}