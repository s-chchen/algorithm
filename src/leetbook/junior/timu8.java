package leetbook.junior;

public class timu8 {

    /*把非0的都填到前面的位置*/
    public static void moveZeroes(int[] nums) {
        int len=nums.length;
        int idx=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                //被覆盖了没关系，因为被覆盖的该元素也只是0
                nums[idx++]=nums[i];
            }
        }
        for(int i=idx;i<len;i++){
            nums[i]=0;
        }
    }

    /*两个指针，一个遇到0停下，等另一个指针(每次加1)去找到非0的元素，来跟前者指针元素交换*/
    public void moveZeroes2(int[] nums) {
        int len=nums.length;
        int idx=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                int temp=nums[idx];
                nums[idx++]=nums[i];
                nums[i]=temp;
            }
        }
    }

    /*两个指针，中间夹了j-i个0*/
    public void moveZeroes3(int[] nums) {
        int len=nums.length;
        for(int i=0,j=0;i<len;i++){
            if(nums[i]!=0){
                int temp=nums[i-j];
                nums[i-j]=nums[i];
                nums[i]=temp;
            }else{
                j++;//表示i递增到该位置，前面有j个0
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }

}
