package suanFa.leetbook.junior.shu;

import java.util.Queue;

/*
* 验证二叉搜索树
* */
public class timu2 {

    /*递归*/
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long min,long max){
        if (root==null) return true;
        if (root.val>=max || root.val<=min) return false;
        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
    }

    /*中序遍历 递归*/

    /*中序遍历 非递归*/

}
