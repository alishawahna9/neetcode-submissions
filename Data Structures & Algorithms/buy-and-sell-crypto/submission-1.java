class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=prices[0];
        int diff=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                max=min;
    
            }
            if(prices[i]>max){
                max=prices[i];
            }
            if(max-min>diff){
                diff=max-min;
            }
        }
        return diff;
    }
}
