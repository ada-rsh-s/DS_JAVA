class Solution {
    public boolean isSubsequence(String s, String t) {
     int count=0,sLength=s.length(),i=0,j=0;

     while(i<t.length()){ 
        if(j>=sLength) break;
        if(s.charAt(j)==t.charAt(i)){
            count++;
            j++;
        }
        i++;
     }  

     if(count>=sLength) 
      return true;
     
     return false;
    }
}