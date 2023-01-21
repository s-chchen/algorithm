package leetbook.junior;

/*
两个数组的交集

给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。

* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class timu6 {

    /*两个指针*/
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list=new ArrayList();
        int l1=0,l2=0;
        while(l1<len1 && l2<len2){
            if(nums1[l1]==nums2[l2]){
                list.add(nums1[l1]);
                l1++;l2++;
            }else{
                if(nums1[l1]<nums2[l2]) l1++;
                else l2++;
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

    /*Map*/

}
