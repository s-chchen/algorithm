package suanFa.leetbook.junior.c_lianbiao;

/*
删除链表的倒数第N个节点
* */
public class timu2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len=getLength(head);
        int idx = len + 1 - n; //顺着数应该删除第几个节点
        if (idx<=0) return head;
        if (idx==1) return head.next;

        int i=1;
        ListNode cur=head;
        while(i<idx-1){
            cur=cur.next;
            i++;
        }
        cur.next=cur.next.next;
        return head;
    }

    public static int getLength(ListNode head){
        int res=0;
        while (head!=null){
            res++;
            head=head.next;
        }
        return res;
    }

    /* 双指针 */
    public static ListNode removeNthFromEnd2(ListNode head, int n){
        ListNode fast=head;
        ListNode slow=head;
        for (int i=0;i<n;i++){
            fast=fast.next;
        }

        // 要删除的是头节点
        if (fast==null) return head.next;

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

}
