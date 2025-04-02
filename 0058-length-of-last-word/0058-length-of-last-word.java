class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length()-1;
        if(size == 0){
            return 1;
        }
        int count = 0;

        for(int i = size; 0 <= i; i--){
            char letter = s.charAt(i);
            
            if(letter == ' ' && count > 0 ){
                break;
            }
            if(letter < 123 && letter > 64){
                count++;
            }
            
            
        }
        return count;
    }
}