package suanFa.leetbook.junior.shu;
/*
* 二叉树的最大深度
* 示例：给定二叉树 [3,9,20,null,null,15,7]
* */

public class timu1 {

    /*递归
    Max( 左子树的最大深度, 右子树的最大深度 )+1 */
    public static int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }
    public static int getMaxDepth(TreeNode root){
        if (root==null) return 0;
        int left=getMaxDepth(root.left);
        int right=getMaxDepth(root.right);
        return Math.max(left,right)+1;
    }

    /*BFS*/
    public static int maxDepth2(TreeNode root){
        return 0;
    }

    /*DFS*/
    public static int maxDepth3(TreeNode root){
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root=TreeNode.buildTreeNode();
        int maxDepth = maxDepth(root);
        System.out.println("maxDepth = " + maxDepth);
    }

}
