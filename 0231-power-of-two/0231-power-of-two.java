class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
        
        // if(n<=0) return false;
        // int powercheck =(int)(Math.log(n) / Math.log(2));
        // if(Math.pow(2,powercheck)==n)
        // return true;
        // else
        // return false;
        
    }
}