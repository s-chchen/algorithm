package suanFa.leetbook.junior.shu;

import java.util.LinkedList;
import java.util.Queue;

/*
对称二叉树
*/
public class timu3 {


    /*递归解决*/
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode left,TreeNode right){
        if (left==null && right==null) return true;
        if (left==null || right==null ||left.val!=right.val) return false;

        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }

    /*非递归*/
    public boolean isSymmetric2(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null) return true;
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode l=queue.poll();
            TreeNode r=queue.poll();
            if (l==null && r==null){}
            else{
                if (l==null || r==null || l.val!=r.val) return false;
                queue.add(l.left);
                queue.add(r.right);
                queue.add(l.right);
                queue.add(r.left);
            }
        }
        return true;
    }

    /*两次DFS，一次从左开始，一次从右开始*/

}
