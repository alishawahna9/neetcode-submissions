class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int diff=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                continue;
    
            }
            if(prices[i]-min>diff){
                diff=prices[i]-min;
            }
        }
        return diff;
    }
}
