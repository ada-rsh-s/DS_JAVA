class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String comPre=strs[0];
        for(int i=1;i<strs.length;i++){
 int length = Math.min(comPre.length(), strs[i].length());

            for(int j=0;j<length;j++){
                if(comPre.charAt(j)!=strs[i].charAt(j)){
                comPre=comPre.substring(0,j);
                break;
                }
            }
                  if (comPre.length() > length) {
                comPre = comPre.substring(0, length);
               
            }
        }
      
        return comPre;
    }
}