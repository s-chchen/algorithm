package suanFa.leetbook.junior.shu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* 二叉树的层序遍历
* */
public class timu4 {

    /*BFS*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if (root==null) return res;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int len=que.size();
            List<Integer> innerRes=new LinkedList<>();
            while (len-->0){
                TreeNode n=que.poll();
                innerRes.add(n.val);
                if (n.left!=null) que.add(n.left);
                if (n.right!=null) que.add(n.right);

            }
            res.add(innerRes);
        }
        return res;
    }

    /*DFS也可以*/
    public List<List<Integer>> levelOrder2(TreeNode root){
        List<List<Integer>> res=new LinkedList<>();
        DFS(res,root,0);
        return res;
    }
    public void DFS(List<List<Integer>> res,TreeNode root,int level){
        if (root==null) return;
        //level表示的是层数，如果level >= list.size()，说明到下一层了，所以
        //要先把下一层的list初始化，防止下面add的时候出现空指针异常
        if (level >= res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        DFS(res,root.left,level+1);
        DFS(res,root.right,level+1);
    }

}
