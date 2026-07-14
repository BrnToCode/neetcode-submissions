// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit=0;

//         for(int i=0;i<prices.length-1;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[j]-prices[i] > profit){
//                     profit=prices[j]-prices[i];
//                 }
//             }
//         }
//         return profit;
//     }
// }


class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int MinPrice=Integer.MAX_VALUE;
        for(int price:prices){
           if(price<MinPrice){
            MinPrice=price;
           }else{
            profit=Math.max(profit,price-MinPrice);
           }
        }
        return profit;
    }
}
