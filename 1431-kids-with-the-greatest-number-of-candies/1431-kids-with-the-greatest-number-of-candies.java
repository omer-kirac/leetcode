class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        for(int i=0;i<candies.length;i++){
            if(greatest <= candies[i]){
                greatest = candies[i];
            }
        }
        List<Boolean> booleanList = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            if(greatest <= candies[i] + extraCandies)
            {
                booleanList.add(true);
            }
            else{
                booleanList.add(false);   
            }
        }
        return booleanList;
    }
}