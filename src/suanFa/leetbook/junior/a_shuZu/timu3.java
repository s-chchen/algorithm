package suanFa.leetbook.junior.a_shuZu;

/*旋转数组*/
public class timu3 {

    public static void rotate(int[] nums, int k) {
         int len = nums.length;
         int temp=nums[0];
         int idx=0;

         //是否会出现原地打转
         boolean[] visited=new boolean[len];

         for(int i=0;i<len;i++){
             idx=(idx+k)%len;

             //出现打转
             if(visited[idx]){
                 idx=(idx+1)%len;
                 temp=nums[idx];
                 i--;
             }else{
                 int t=nums[idx];
                 nums[idx]=temp;
                 visited[idx]=true;
                 temp=t;
             }


         }
    }

}
