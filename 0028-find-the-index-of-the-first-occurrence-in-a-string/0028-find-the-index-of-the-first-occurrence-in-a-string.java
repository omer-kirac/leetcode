class Solution {
    public int strStr(String haystack, String needle) {


        int count = 0;
        int haystackPointer = 0;

        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(count)){
                count++;
                if(count == 1){
                    haystackPointer = i; 
                }
                
            }else{
                count = 0;
                i = haystackPointer++;
            }

            if(count == needle.length()){
                return i - count + 1;
            }

            System.out.println(i);
        }
        return -1;
    }   
}