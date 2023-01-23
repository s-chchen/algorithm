package suanFa.leetbook.junior.b_ziFuChuang;

import javax.xml.stream.events.Characters;
/*
* 字符串转换整数 (atoi)
* 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。

函数 myAtoi(string s) 的算法如下：

读入字符串并丢弃无用的前导空格
检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
返回整数作为最终结果。
注意：

本题中的空白字符只包括空格字符 ' ' 。
除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符
*/
public class timu6 {

    public static int myAtoi(String s) {
        String[] s1 = s.trim().split(" ");
        s=s1[0];
        int len=s.length();
        int res=0;
        char flag='n';
        char flagNum='n';
        for(int i=0;i<len;i++){
            if(flagNum=='n'&&(s.charAt(i)=='+'||s.charAt(i)=='-')&&flag=='n'){
                flag=s.charAt(i);
                continue;
            }
            //isLetterOrDight 或者 [0-9]
            if(Character.isDigit(s.charAt(i))){
                flagNum='y';

                /*方式一*/
                /*int t=s.charAt(i)-'0';
                if ((Integer.MAX_VALUE-t)/10<res){
                    return flag=='-'?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
                res=res*10+(s.charAt(i)-'0');*/

                /*方式二*/
                int oldRes=res;
                res=res*10+(s.charAt(i)-'0');
                if (res/10!=oldRes){
                    return flag=='-'?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }


            }else{
                return flag=='-'?-res:res;
            }
        }
        return flag=='-'?-res:res;
    }

    public static int myAtoi2(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int index = 0;
        // 先去除空格
        while (index < length && chars[index] == ' '){
            index++;
        }
        // 极端情况 "  " 和""
        if(index >= length){
            return 0;
        }
        // 再判断符号
        int sign =  1;
        if(chars[index] == '-' || chars[index] == '+'){
            if(chars[index] == '-'){
                sign = -1;
            }
            index++;
        }
        int result = 0;
        int temp = 0;
        while (index < length){
            int num = chars[index] - '0';
            if(num > 9 || num < 0){
                break;
            }
            temp = result;
            result = result * 10 + num;
            // 越界后，数值和期望数值发生变化，取余再除10获取原始值，比对判断
            if(result/10 !=temp){
                if(sign > 0){
                    return Integer.MAX_VALUE;
                }else {
                    return Integer.MIN_VALUE;
                }
            }
            index++;
        }
        return result*sign;
    }

    public static void main(String[] args) {
        String s="2147483648";
        int i = myAtoi(s);
        System.out.println("i = " + i);
        
    }

}
