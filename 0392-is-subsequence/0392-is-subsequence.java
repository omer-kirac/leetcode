class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        int sSize = s.length();
        int tSize = t.length();

        if(sSize == 0){
            return true;
        }

        while(tIndex < tSize){
            char sLetter = s.charAt(sIndex);
            char tLetter = t.charAt(tIndex);
            if(sLetter == tLetter){
                sIndex++;

            }

            if(sIndex == sSize){
                return true;
            }
            tIndex++;
        }
        return false;
    }
}