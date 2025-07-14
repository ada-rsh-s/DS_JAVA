class Solution {
    public int climbStairs(int n) {
        int i=0;
        int first=0,second=1,temp;
        
        while(i<n){
            temp = first;
            first=second;
            second=temp+second;
            i++;
        }        
        return second;
    }
}