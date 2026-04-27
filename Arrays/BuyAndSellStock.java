class Solution {
    public int maxProfit(int[] prices) {
        //Brute force approach :- Time Complexity - O(n2)
       /* int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            int currProfit = 0;
            for(int j = i+1; j < prices.length; j++){
               currProfit = prices[j] - prices[i];
               maxProfit = Math.max(currProfit , maxProfit);
            }
        }
        return maxProfit;*/

        //Optimize approach :- Time Complexity - O(n)
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                maxPrice = Math.max(maxPrice , prices[i] - minPrice);
            }
        }
        return maxPrice;


    }
}