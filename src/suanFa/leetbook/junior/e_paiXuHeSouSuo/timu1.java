package suanFa.leetbook.junior.e_paiXuHeSouSuo;
/*
* 排序和搜索
* */
public class timu1 {

    /*利用nums1多余的空间，从左到右排序*/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n;
        if (n==0) return;

        /*nums1的元素都后移到末尾，merge2方法则无需此for循环*/
        for (int i=len-1;i>=n;i--){
            nums1[i]=nums1[i-n];
        }
        /*nums1和nums2的元素一一对比*/
        int l1=n,l2=0;
        for (int i=0;i<len;i++){
            //方式一
            if (l1<len && l2<n){
                nums1[i]=nums1[l1]<=nums2[l2]?nums1[l1++]:nums2[l2++];
            }else if (l1>=len && l2<n){
                nums1[i]=nums2[l2];
                l2++;
            }else if (l1<len && l2>=n){
                break;
            }
            //方式二
            if (l2<n){
                nums1[i]=(l1<len && nums1[l1]<=nums2[l2])?nums1[l1++]:nums2[l2++];
            }
        }
    }

    /*利用nums1多余的空间，从右到左排序*/
    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        int l1=m-1;
        int l2=n-1;
        int i=m+n-1;
        while(l2>=0){
            // 注意这里三目运算符的后两目，nums1放在nums2之前
            nums1[i--]=(l1>=0 && nums1[l1]>nums2[l2])?nums1[l1--]:nums2[l2--];
        }
    }

    /*api*/
    public static void merge3(int[] nums1, int m, int[] nums2, int n){
        System.arraycopy(nums2,0,nums1,m,n);
    }

    public static void main(String[] args) {
        int nums1[]=new int[]{1,2,4,5,6,0};
        int nums2[]=new int[]{3};
        int m=5,n=1;
        merge3(nums1,m,nums2,n);
        System.out.println(nums1);
    }

}
