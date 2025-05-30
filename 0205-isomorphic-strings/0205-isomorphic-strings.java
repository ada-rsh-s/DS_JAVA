class Solution {
    public boolean isIsomorphic(String s, String t) {
        
            HashMap<Character,Character> stMap=new HashMap<>();
            HashMap<Character,Character> tsMap=new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(stMap.containsKey(sChar)){
               if(stMap.get(sChar)!=tChar) 
                    return false;
            }
            else{
                stMap.put(sChar,tChar);
           }
           if(tsMap.containsKey(tChar)){
               if(tsMap.get(tChar)!=sChar) 
                    return false;
            }else{
                tsMap.put(tChar,sChar);
        }}
        
        return true;
    }
}