package leetbook.junior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 加一
*
给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。
* */

public class timu7 {

    /*受限于int的字节长，只能通过部分实例*/
    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        int num=0;
        for(int i=0;i<len;i++){
            num=num*10+digits[i];
        }
        num++;

        List<Integer> list=new ArrayList<>();
        while(num%10!=0 || (num%10==0&&num>0)){
            list.add(num%10);
            num=num/10;
        }

        int[] res=new int[list.size()];
        for(int i=list.size()-1,j=0;i>=0;i--,j++){
            res[i]=list.get(j);
        }

        return res;
    }

    /*根据末尾是否=9，来进行后续操作
    * 注意提前可以返回*/
    public int[] plusOne2(int[] digits) {
        int len=digits.length;
        int num=0;
        for(int i=len-1;i>=0;i--){
            //如果不是9，则加1返回，如果是9先置为0
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] res=new int[len+1];
        res[0]=1;
        return res;
    }

    public static void main(String[] args) {
        int[] nums={9,8,7,6,5,4,3,2,1,0};
        int[] res=plusOne(nums);
        Arrays.stream(res).forEach(System.out::println);
    }

}
