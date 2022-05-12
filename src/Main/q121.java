package Main;

public class q121 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int lbp = Integer.MAX_VALUE;
        int tp = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < lbp) {
                lbp = prices[i];
            }
            if((prices[i] - lbp) > tp) {
                tp = prices[i] - lbp;
            }
        }
        return (tp);
    }
}

