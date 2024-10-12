class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,og=m+n-1;
        while(j>=0){
            if(i>=0 && nums2[j]<=nums1[i]){
                 nums1[og--]=nums1[i--];
                 nums1[i+1]=0;
            }else{
                 nums1[og--]=nums2[j--];
            }
        }
    }
}