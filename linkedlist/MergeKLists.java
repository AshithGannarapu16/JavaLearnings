import java.util.PriorityQueue;

public class MergeKLists {
    // Merge K sorted linked lists using a min-heap
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode node : lists) {
            if (node != null) pq.offer(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();
            tail.next = smallest;
            tail = tail.next;
            if (smallest.next != null) pq.offer(smallest.next);
        }

        // Ensure the last node points to null (in case we reused existing nodes)
        if (tail != null) tail.next = null;

        return dummy.next;
    }

    // Helper to print a list
    public static String toString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        return sb.toString();
    }
}
