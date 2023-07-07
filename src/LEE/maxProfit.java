package LEE;

import java.util.HashMap;

public class maxProfit {
    public int maxProfit(int[] prices){
        int leftMin = Integer.MAX_VALUE;
        int temp = 0;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < leftMin){
                leftMin = prices[i];
            }
            temp = prices[i] - leftMin;

            maxProfit = Math.max(temp, maxProfit);
        }

        return maxProfit;
    }

}
