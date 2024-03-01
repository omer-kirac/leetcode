class Solution {
    public int searchInsert(int[] nums, int target) {
        int min= Math.abs(nums[0] - target);
        int temp = 0;
        int location = 0;
        for(int i = 0; i < nums.length; i++){
            temp = Math.abs(nums[i] - target);
            if(temp <= min){
                min = temp;
                location = i;
            }
        }
        if(nums[nums.length-1] < target ||  nums[location] < target ){
            location++;
        }
        return location;
    }
}