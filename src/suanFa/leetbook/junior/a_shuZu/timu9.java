package suanFa.leetbook.junior.a_shuZu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* 两数之和
*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。
*/

public class timu9 {

    /*map存储 target-当前元素的值*/
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res[0]=i;
                res[1]=map.get(nums[i]);
            }else{
                map.put(target-nums[i],i);
            }
        }
        return res;
    }

    /*双指针，注意while的条件*/
    public static int[] twoSum2(int[] nums, int target) {
        int j = 1;
        int i = 0;
        int maxArea = nums.length - 1;
        while (nums[i] + nums[j] != target){
            if(j == maxArea){
                i++;
                j = i;
            }
            j++;
        }
        return new int[]{i,j};
    }

    public static void main(String[] args) {
        int [] nums={1,3,2,6,8,10};
        int target=10;
        int[] res=twoSum2(nums,target);
        Arrays.stream(res).forEach(System.out::println);
    }

}
