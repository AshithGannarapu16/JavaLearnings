/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the list
        ListNode midNode = findMiddleNode(head);
        ListNode nextToMid = midNode.next;
        midNode.next = null;

        // Step 2: Reverse the second half
        ListNode p2 = reverseList(nextToMid);

        // Step 3: Merge the two halves
        ListNode p1 = head;
        while (p1 != null && p2 != null) {
            ListNode p1Next = p1.next;
            ListNode p2Next = p2.next;

            p1.next = p2;
            if (p1Next == null) break;
            p2.next = p1Next;

            p1 = p1Next;
            p2 = p2Next;
        }
    }

    public ListNode findMiddleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}