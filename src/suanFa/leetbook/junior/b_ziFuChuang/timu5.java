package suanFa.leetbook.junior.b_ziFuChuang;
/*
* 验证回文串
* 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。

字母和数字都属于字母数字字符。

给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
*/
public class timu5 {

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if (c>='a' && c<='z' || c>='A' && c<='Z'
                    || c>='0' && c<='9'){
                sb.append(c);
            }
        }
        int l=0;
        int r=sb.length()-1;
        while(l<r){
            if (sb.charAt(l)==sb.charAt(r)){
                l++;r--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s){
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        String s1 = new StringBuilder(s).reverse().toString();
        return s.equals(s1);
    }

    /*一次for循环*/
    public static boolean isPalindrome3(String s){
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean boo=isPalindrome3(s);
        System.out.println("boo = " + boo);
    }

}
