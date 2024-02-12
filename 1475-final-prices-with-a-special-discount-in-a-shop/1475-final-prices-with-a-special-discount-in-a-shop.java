class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length; i++){
            for(int j = 0; j < prices.length; j++){
                if(i<j && prices[j] <= prices[i]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
            
        }
        return prices;
    }
}