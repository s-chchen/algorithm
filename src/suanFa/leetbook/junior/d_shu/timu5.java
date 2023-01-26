package suanFa.leetbook.junior.d_shu;
/*
* 将有序数组转换为二叉搜索树
* */
public class timu5 {

    /*递归*/
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=new TreeNode();
        if (nums==null) return root;

        int len=nums.length;
        root=sortedArrayToBST(nums,0,len-1);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums,int l,int r){
        if (l>r) return null;
        int mid=(l+r)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left=sortedArrayToBST(nums,l,mid-1);
        n.right=sortedArrayToBST(nums,mid+1,r);
        return n;
    }

    /*BFS*/

}
