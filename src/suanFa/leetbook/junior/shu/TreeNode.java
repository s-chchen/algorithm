package suanFa.leetbook.junior.shu;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }

    static TreeNode buildTreeNode(){
        TreeNode l000=new TreeNode(7);
        TreeNode l001=new TreeNode(8);
        TreeNode l00=new TreeNode(3,l000,l001);
        TreeNode l01=new TreeNode(4);
        TreeNode l0=new TreeNode(1,l00,l01);

        TreeNode l10=new TreeNode(5);
        TreeNode l11=new TreeNode(6);
        TreeNode l1=new TreeNode(2,l10,l11);

        TreeNode root=new TreeNode(0,l0,l1);

        return root;
    }
}
