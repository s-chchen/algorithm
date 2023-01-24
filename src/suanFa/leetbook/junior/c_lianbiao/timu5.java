package suanFa.leetbook.junior.c_lianbiao;
/*
回文链表
*/

import java.util.Stack;

public class timu5 {

    /*放到字符串，再reverse*/
    public static boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        if (head==null || head.next==null) return true;
        while (head!=null) {
            sb.append(head.val);
            head=head.next;
        }
        String s1=sb.toString();
        String s2=sb.reverse().toString();
        if (s1.equals(s2)) return true;
        return false;
    }

    /*快慢指针*/
    public static boolean isPalindrome2(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (fast!=null){
            slow=slow.next;
        }

        slow=timu3.reverseList2(slow);
        fast=head;
        while(slow!=null){
            if (fast.val!=slow.val) return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }

    /*堆栈*/
    public static boolean isPalindrome3(ListNode head){
        Stack<Integer> stack=new Stack<>();
        if (head==null || head.next==null) return true;

        int len=0;
        ListNode cur=head;
        while(cur!=null){
            len++;
            stack.push(cur.val);
            cur=cur.next;
        }

        cur=head;
        for (int i=0;i<len/2;i++){
            if (cur.val==stack.pop()){cur=cur.next;}
            else return false;
        }
        return true;
    }

    /*递归*/
    static ListNode temp;
    public static boolean isPalindrome4(ListNode head) {
        temp = head;
        return check(head);
    }
    private static boolean check(ListNode head) {
        if (head == null)
            return true;
        boolean res = check(head.next) && (temp.val == head.val);
        temp = temp.next;
        return res;
    }

    /* 递归2 */
    static StringBuilder sb1=new StringBuilder();
    static StringBuilder sb2=new StringBuilder();
    public static boolean isPalindrome5(ListNode head) {
        apan(head);
        if (sb1.toString().equals(sb2.toString())) return true;
        return false;
    }
    private static void apan(ListNode head) {
        if (head == null)
            return;
        sb2.append(head.val);
        apan(head.next);
        sb1.append(head.val);
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,2,1};
        int[] a2=new int[]{1};
        boolean boo=isPalindrome5(ListNode.buildListNode(a2));
        System.out.println(boo);
    }

}
