class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean countstart=false;
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ' && countstart==false)
            countstart=true;
            if(countstart==true){
                if(s.charAt(i)==' '){
                    break;
                }else{
                    count++;
                }
            }

        }
        return count;
    }
}