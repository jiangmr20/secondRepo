package com.suguowen.test;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class OfferT11 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode p1=tmp, p2=tmp;

        while(k > 0 && p1.next != null){
            p1 = p1.next;
            k--;
        }
        //length < k
        if(k != 0){
            return null;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        tmp = null; //help gc
        return p2;
    }

}
