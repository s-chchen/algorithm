package suanFa.leetbook.junior.f_dongTaiGuiHua;

import java.util.Stack;

/*
* 买卖股票的最佳时期
*
* 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。

你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。

返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0

* */
public class timu2 {

    public static void main(String[] args) {
        int[] a=new int[]{7,1,5,3,6,4};
        int res=maxProfit3(a);
        System.out.println(res);
    }

    /*动态规划
        dp[0][i]表示第i天手里 没有股票
        dp[1][i]表示第i天手里 有股票
    * dp[0][i]=max( dp[0][i-1] , dp[1][i-1]+price[i] )
    * dp[1][i]=max( dp[0][i-1]-price[i] , dp[1][i-1] )
    * */
    public static int maxProfit(int[] prices) {
        int len=prices.length;
        int[][] dp=new int[2][len];
        dp[0][0]=0;
        dp[1][0]=-prices[0];
        for (int i=1;i<len;i++){
            dp[0][i]=Math.max(dp[0][i-1] ,dp[1][i-1]+prices[i]);
            dp[1][i]=Math.max(-prices[i] ,dp[1][i-1]);
        }
        return dp[0][len-1];
    }

    /*动态规划的优化*/
    public int maxProfit2(int[] prices) {
        int len=prices.length;
        int unHas=0;
        int has=-prices[0];
        for (int i=1;i<len;i++){
            unHas=Math.max(unHas,has+prices[i]);
            has=Math.max(has,-prices[i]);
        }
        return unHas;
    }

    /*双指针*/
    public static int maxProfit3(int[] prices) {
        int len=prices.length;
        int max=0,min=prices[0];
        int curIdx=0;
        while(curIdx<len){
            max=Math.max(max,prices[curIdx]-min);
            min=Math.min(prices[curIdx++],min);
        }
        return max;
    }

    /*单调栈，原理其实和双指针类似*/
    public int maxProfit4(int[] prices) {
        int len=prices.length;
        int max=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(prices[0]);
        for (int i=1;i<len;i++){
            if (stack.peek()>prices[i]){
                stack.pop();
                stack.push(prices[i]);
            }else{
                max=Math.max(max,prices[i]-stack.peek());
            }
        }
        return max;
    }

    /*最大子序和*/
    /*1,2,-1,3,-2*/
    public int maxProfit5(int[] prices) {
        int len=prices.length;
        int[] ziXu=new int[len];
        ziXu[0]=prices[0]-prices[0];
        for (int i=1;i<len;i++){
            ziXu[i]=prices[i]-prices[i-1];
        }
        int cur=ziXu[0]; //cur表示一定要包含当前位置元素时的最大值
        int max=0;  //最大值
        for (int i=1;i<len;i++){
            cur=Math.max(cur+ziXu[i],ziXu[i]);
            max=Math.max(max,cur);
        }
        return max;
    }

    /*最大子序和，改进*/
    public int maxProfit6(int[] prices){
        int len=prices.length;
        int cur=0;
        int max=cur;
        for (int i=1;i<len;i++){
            cur=Math.max(cur,0)+prices[i]-prices[i-1];
            max=Math.max(max,cur);
        }
        return max;
    }

    /*暴力求解*/

}
