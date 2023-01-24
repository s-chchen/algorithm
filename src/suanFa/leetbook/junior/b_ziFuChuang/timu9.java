package suanFa.leetbook.junior.b_ziFuChuang;
/*
* 最长公共前缀
* 编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""*/

public class timu9 {

    public static String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        StringBuilder sb=new StringBuilder();
        int j=0;
        while (true){
            //这个if很重要
            if (j>=strs[0].length()) return sb.toString();

            char c=strs[0].charAt(j);
            for (int i=0;i<len;i++){
                if (j>=strs[i].length()) return sb.toString();

                if (strs[i].charAt(j)==c){}
                else{
                    return sb.toString();
                }

                if (i==len-1) sb.append(c);
            }
            j++;
        }
    }

    /*推荐*/
    /*先找第一个与第二个字符串的最长前缀，找把结果与第三个....*/
    public static String longestCommonPrefix2(String[] strs){
        if (strs==null || strs.length==0) return "";

        //默认第一个字符串是公共前缀
        String pre=strs[0];
        int i=1;
        while (i<strs.length){
            //下标不是从0开始的话
            while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
            }
            if (pre=="") return "";
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] strs=new String[]{"flower","flow","flight"};
        String[] strs2=new String[]{"caa","ad","a","acb"};

        String s = longestCommonPrefix2(strs2);
        System.out.println("s = " + s);
        
    }

}
