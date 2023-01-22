package suanFa.leetbook.junior.b_ziFuChuang;
/*
* 整数反转
* 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

假设环境不允许存储 64 位整数（有符号或无符号）。
*/
public class timu2 {

    /**/
    public static int reverse(int x) {
        int res=0;
        while(x!=0){
            int t=x%10;
            int oldRes=res;
            res=res*10+t;
            if ((res-t)/10!=oldRes) return 0;
            x/=10;
        }
        return res;
    }

    /*利用stringbuilder反转，再利用NumberFormatException*/
    public static int reverse2(int x){
        int xx=Math.abs(x);
        int res=0;
        try{
            res = Integer.valueOf(new StringBuilder(String.valueOf(xx)).reverse().toString());
        }catch (NumberFormatException e){
            return 0;
        }
        res=x>=0?res:-res;
        return res;
    }


    public static void main(String[] args) {
        int x=-123;
        int res=reverse2(x);
        System.out.println(res);

        System.out.println(-123%10);
    }

}
