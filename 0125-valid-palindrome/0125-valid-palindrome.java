class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int front = 0;
        int back = s.length()-1;

        while(front <= back){
            char frontLetter = s.charAt(front);
            char backLetter = s.charAt(back);
            if(!Character.isLetterOrDigit(frontLetter)){
                front++;
            }else if(!Character.isLetterOrDigit(backLetter)){
                back--;
            }else{
                if(Character.toLowerCase(frontLetter) != Character.toLowerCase(backLetter)){
                    return false;
                }
                front++;
                back--;
            }
        }
        
        return true;
    } 
}