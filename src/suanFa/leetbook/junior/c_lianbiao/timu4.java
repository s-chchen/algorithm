package suanFa.leetbook.junior.c_lianbiao;
/*合并两个有序链表*/
public class timu4 {

    // 1 3 3 5 6 7
    // 1 2 3 4 6 9
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode cur=head;
        while (list1!=null && list2!=null){
            if (list1.val<=list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        cur.next=list1==null?list2:list1;
        return head.next;
    }

    public static void main(String[] args) {
        int[] l1=new int[]{1,3,3,5,6,7};
        ListNode n1=ListNode.buildListNode(l1);
        int[] l2=new int[]{1,2,3,4,6,9};
        ListNode n2=ListNode.buildListNode(l2);
        ListNode res=mergeTwoLists(n1,n2);
        System.out.println(res);
    }

}
