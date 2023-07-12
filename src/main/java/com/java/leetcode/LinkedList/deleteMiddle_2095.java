package com.java.leetcode.LinkedList;

/*You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.*/

public class deleteMiddle_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No middle node to delete
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev != null) {
            prev.next = slow.next;
        } else {
            head = null; // Set head to null if the middle node is the first and only node
        }

        return head;
    }
}

/*
The function deleteMiddleNode takes the head of a linked list (ListNode head) as input and returns the modified head of the linked list after deleting the middle node.
First, the function checks if the linked list is empty (head == null) or contains only one node (head.next == null). In such cases, there is no middle node to delete, so it returns null.
If the linked list has more than one node, two pointers slow and fast are initialized to the head of the linked list, and a prev pointer is set to null.
The function uses a two-pointer technique to find the middle node. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
In each iteration of the while loop, the fast pointer moves two steps ahead (fast = fast.next.next), and the slow pointer moves one step ahead (slow = slow.next).
The prev pointer keeps track of the previous node of the slow pointer, allowing us to update the next pointer of the previous node to skip the middle node.
Once the loop terminates, the slow pointer points to the middle node, and the prev pointer points to the node before the middle node.
To delete the middle node, the next pointer of the prev node is updated to skip the middle node (prev.next = slow.next).
Finally, if the prev pointer is not null, the modification is done by updating the next pointer of the previous node. If the prev pointer is null, it means the middle node is the first and only node, so the head is set to null.
The modified head of the linked list is returned.
 */
