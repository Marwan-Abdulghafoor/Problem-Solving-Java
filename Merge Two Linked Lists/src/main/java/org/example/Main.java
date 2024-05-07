package org.example;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(mergeTwoLists(list1, list2));
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode temp;
        ListNode head;
        ListNode cur1;
        ListNode cur2;
        if (list1.val < list2.val || list1.val == list2.val) {
            temp = list1;
            head = list1;
            cur1 = list1.next;
            cur2 = list2;
        } else {
            temp = list2;
            head = list2;
            cur1 = list1;
            cur2 = list2.next;
        }
        while (cur1 != null || cur2 != null) {
            if (cur1 == null){
                temp.next = cur2;
                temp = cur2;
                cur2 = cur2.next;
            }else if(cur2 == null){
                temp.next = cur1;
                temp = cur1;
                cur1 = cur1.next;
            }else if (cur1.val < cur2.val || cur1.val == cur2.val) {
                temp.next = cur1;
                temp = cur1;
                cur1 = cur1.next;
            } else {
                temp.next = cur2;
                temp = cur2;
                cur2 = cur2.next;
            }
        }
        return head;
    }
}

