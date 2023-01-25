package suanFa.leetbook.junior.c_lianbiao;

import java.util.HashMap;
import java.util.Map;

/*
* 环形链表
* */
public class timu6 {

    static Map<ListNode,Integer> map=new HashMap<>();
    public static boolean hasCycle(ListNode head) {
        if (head==null || head.next==null) return false;
        int i=0;
        while (head!=null){
            i++;
            if (map.containsKey(head)){
                return true;
            }else{
                map.put(head,i);
                head=head.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
        ListNode head=ListNode.buildListNode(a);
        ListNode cur=head;
        cur=cur.next.next;
        ListNode tail=cur.next.next;
        tail.next=cur;
        boolean boo=hasCycle(head);
        System.out.println("boo = " + boo);
    }

}
