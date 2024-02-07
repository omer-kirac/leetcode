class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        ArrayList<Integer> removedList = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                removedList.add(nums[i]);
                k++;
            }
        }
        for(int i = 0; i < removedList.size(); i++){
            nums[i] = removedList.get(i);
        }
        return k;
    }
}