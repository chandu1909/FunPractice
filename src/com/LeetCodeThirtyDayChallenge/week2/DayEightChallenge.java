package com.LeetCodeThirtyDayChallenge.week2;

public class DayEightChallenge {
    public ListNode middleNode(ListNode head) {
        System.out.println(head);

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println(slowPointer.val);


        return slowPointer;
    }

}
