class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length;
        int rowlength = matrix[0].length;
        int low = 0, high = length - 1, mid=(low+high)/2;

        while(low<=high){
            mid=(low+high)/2;
           if(matrix[mid][0]<=target && matrix[mid][rowlength-1]>=target){
                break;
           } else if(matrix[mid][0]<target){
                low=mid+1;
            }else{
              high=mid-1;
            }
        }
        int selectedArr=mid;
        low=0;high=rowlength-1;
         while(low<=high){
            mid=(low+high)/2;
           if(matrix[selectedArr][mid]==target){
                return true;
            }else if(matrix[selectedArr][mid]>target){
                high=mid-1;
            }else{
              low=mid+1;
            }
        }

    return false;
    }
}