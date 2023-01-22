package suanFa.leetbook.junior.b_ziFuChuang;
/*反转字符串
* 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
*/
public class timu1 {

    /*
    交换的多种方法
    *
    * */
    public static void swap(char s[],int i,int j){
        char t=s[i];
        s[i]=s[j];
        s[j]=t;
    }
    public static void swap2(char s[],int i,int j){
        s[i]=(char)(s[i]+s[j]);
        s[j]=(char)(s[i]-s[j]);
        s[i]=(char)(s[i]-s[j]);
    }
    public static void swap3(char s[],int i,int j){
        s[i]=(char)(s[i]^s[j]);
        s[j]=(char)(s[i]^s[j]);
        s[i]=(char)(s[i]^s[j]);
    }


    public void reverseString(char[] s) {
        int len=s.length;
        for(int i=0;i<len/2;i++){
            swap(s,i,len-i-1);
        }
    }

}
