package suanFa.leetbook.junior.a_shuZu;

import java.util.Arrays;

/*timu5 只出现一次的数字 【异或】*/
public class timu5 {

    public int singleNumber(int[] nums) {
        int len=nums.length;
        int res=0;
        for (int i=0;i<len;i++){
            res^=nums[i];
        }
        return res;
    }

    /*当时自己的想法：
    * for循环，判断元素前后是否有相同的元素，如果没有直接返回
    * 注意最后元素判断的时候，只需要判断前面是否有元素相同*/
    public static int singleNumber2(int[] nums) {
        int len=nums.length;
        if(len==1) return nums[0];
        Arrays.sort(nums);
        for (int i=0;i<len;i++){
            if (i==0){
                if (nums[i]==nums[i+1]){}
                else return nums[i];
            }
            else if (i==len-1){
                if (nums[i]==nums[i-1]){}
                else return nums[i];
            }else{
                if (nums[i]==nums[i-1] || nums[i]==nums[i+1]){}
                else return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,1};
        int res=singleNumber2(nums);
        System.out.println(res);
    }

}
