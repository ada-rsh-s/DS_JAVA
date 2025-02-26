class Solution {
    public boolean isPalindrome(String s) {
        String sLow=s.toLowerCase();
        boolean pal=true;

        int i=0,j=sLow.length()-1;
        while(i<j){
         while (i<j &&!(sLow.charAt(i) >= 'a' && sLow.charAt(i) <= 'z' || sLow.charAt(i) >= '0' && sLow.charAt(i) <= '9')) {
            i++;
         }

         while (i<j && !(sLow.charAt(j) >= 'a' && sLow.charAt(j) <= 'z' || sLow.charAt(j) >= '0' && sLow.charAt(j) <= '9')) {
            j--;
         }

  if(!(sLow.charAt(i)==sLow.charAt(j))) {
             pal=false ;
             break;}
             i++;
             j--;
               
            
        }

        return pal;
    }
}