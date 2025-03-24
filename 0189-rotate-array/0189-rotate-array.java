class Solution {
    public void rotate(int[] nums, int k) {
        int[] list = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            list[(i + k) % nums.length] = nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = list[i];
        }
        
    
    }
}