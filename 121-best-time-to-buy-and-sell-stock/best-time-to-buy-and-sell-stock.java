class Solution {
    public int maxProfit(int[] prices) {
        int currMin=prices[0];
        int tempProfit=0;
        int maxProfit=0;

        for(int num : prices){
            currMin=Math.min(currMin,num);
            tempProfit=num-currMin;
            maxProfit=Math.max(maxProfit,tempProfit);
        }
        return maxProfit;
    }
}