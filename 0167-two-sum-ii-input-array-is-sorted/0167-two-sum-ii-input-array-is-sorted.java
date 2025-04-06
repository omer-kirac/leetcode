class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int sum = 0;
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            sum = numbers[start] + numbers[end];
            if(target < sum){
                end--;
            }else if(sum < target){
                start++;
            }else{
                index[0] = start + 1;
                index[1] = end + 1;
                return index;
            }
        }
        return index;
    }
}