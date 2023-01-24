package suanFa.leetbook.junior.c_lianbiao;

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

    static ListNode buildListNode(int[] a){
        if (a.length==0 || a==null) return null;
        ListNode head=new ListNode(a[0],null);
        ListNode cur=head;
        for (int i=1;i<a.length;i++){
            ListNode newNode=new ListNode(a[i],null);
            cur.next=newNode;
            cur=newNode;
        }
        return head;
    }
}
