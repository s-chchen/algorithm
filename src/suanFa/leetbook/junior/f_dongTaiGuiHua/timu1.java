package suanFa.leetbook.junior.f_dongTaiGuiHua;
/*
* 爬楼梯
* 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
* */

public class timu1 {

    /*
      动态规划
      dp[i]=dp[i-1]+dp[i-2]
      dp[0]=1,dp[1]=1,dp[2]=2
    * */
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    /*递归*/

    /*尾递归*/
    public int climbStairs3(int n){
        return Fibonacci(n,1,1);
    }
    public static int Fibonacci(int n,int a,int b){
        if (n<=1) return b;
        return Fibonacci(n-1,b,a+b);
    }


}
