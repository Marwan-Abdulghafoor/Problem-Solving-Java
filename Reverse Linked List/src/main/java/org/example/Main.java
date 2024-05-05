package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while (cur.next != null){
            ListNode temp = cur.next;
            cur.next = head;
            head = cur;
            cur = temp;
        }
        return head;
    }
}

