class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder(s.toLowerCase());
        boolean pal=true;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {

                str.deleteCharAt(i);
                i--;
            }
        }

         
        int i=0,j=str.length()-1;
        while(i<str.length()/2){
            if(!(str.charAt(i)==str.charAt(j))) {
             pal=false ;
                          break;
}
             i++;
             j--;          
        }

        return pal;
    }
}