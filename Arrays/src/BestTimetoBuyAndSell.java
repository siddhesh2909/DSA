public class BestTimetoBuyAndSell {
    public static void main(String[] args)
    {
        int[] prices ={7,1,5,3,6,4};

        int minPrice=prices[0];
        int maxProfit=0;

        for(int i=1 ; i<prices.length-1 ; i++)
        {
            int profit = prices[i] - minPrice;

            maxProfit = Math.max(profit,maxProfit);

            minPrice = Math.min(prices[i],minPrice);
        }

        System.out.println(maxProfit);
    }
}
