package suanFa.leetbook.junior.a_shuZu;

public class timu2 {

    /*动态规划*/
    /* dp[0][i] 第i天手里没有股票的最大利润
    *  dp[0][i] = max( dp[0][i-1],dp[1][i-1]+price[i] ) */

    /* dp[1][i] 第i天手里有股票的最大利润
    *  dp[1][i] = max( dp[1][i-1],dp[0][i-1]-price[i] ) */

    /* 边界值
    *  dp[0][0] = 0 */
    /* dp[1][0] = -price[i] */
    public static int maxProfit(int[] prices) {
        int len=prices.length;
        int[][] dp=new int[2][len];
        dp[0][0]=0;
        dp[1][0]=-prices[0];
        int i=0;
        for(;i<len;i++){
            dp[0][i] = Math.max( dp[0][i-1],dp[1][i-1]+prices[i] );
            dp[1][i] = Math.max( dp[1][i-1],dp[0][i-1]-prices[i] );
        }
        return dp[0][i-1];

    }

    /*可以优化，不用dp【】[][]，而是用两个变量*/

}
