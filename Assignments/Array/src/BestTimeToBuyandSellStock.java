public class BestTimeToBuyandSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
       int minValue=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int i: prices)
       {
           if(i<minValue)
           {
               minValue=i;
           }
           else{
               int profit=i - minValue;
               if(maxProfit<profit)
               {
                   maxProfit=profit;
               }
           }
       }
        System.out.println(maxProfit);
    }
}
