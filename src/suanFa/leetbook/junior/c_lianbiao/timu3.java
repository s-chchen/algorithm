package suanFa.leetbook.junior.c_lianbiao;
/*
* 反转链表
* */
public class timu3 {

    /*递归*/
    public static ListNode reverseList(ListNode head) {
        if (head==null) return head;
        if (head.next==null) return head;
        ListNode curHead = reverseList(head.next);

        //方式一
//        ListNode curTail=curHead;
//        while (curTail.next!=null){
//            curTail=curTail.next;
//        }
//        curTail.next=head;

        //方式二
        head.next.next=head;

        head.next=null;
        return curHead;
    }

    /*堆栈*/

    /*双链表*/
    public static ListNode reverseList2(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode newHead=new ListNode(head.val);
        while(head.next!=null){
            ListNode curHead=new ListNode(head.next.val);
            curHead.next=newHead;
            newHead=curHead;
            head=head.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4};
        ListNode head=new ListNode(a[0],null);
        ListNode cur=head;
        for (int i=1;i<a.length;i++){
            ListNode newNode=new ListNode(a[i],null);
            cur.next=newNode;
            cur=newNode;
        }
        ListNode res=reverseList2(head);
        System.out.println(res);
    }

}
