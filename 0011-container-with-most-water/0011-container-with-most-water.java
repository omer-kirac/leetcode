class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        int volume = 0;

        while(start < end){
            int left = height[start];
            int right = height[end];
            
            if(left < right){
                volume = left * (end-start);
                start++;
            }else{
                volume = right * (end - start);
                end--;
            }

            if(max < volume){
                max  = volume;
            }

        }
        return max;
    }
}