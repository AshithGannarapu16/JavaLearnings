public class testMergeKLists {
    public static void main(String[] args) {
        // Example 1:
        ListNode a1 = new ListNode(1, new ListNode(10, new ListNode(20)));
        ListNode a2 = new ListNode(4, new ListNode(11, new ListNode(13)));
        ListNode a3 = new ListNode(3, new ListNode(8, new ListNode(9)));
        ListNode[] lists1 = new ListNode[]{a1, a2, a3};
        ListNode res1 = MergeKLists.mergeKLists(lists1);
        System.out.println("Output 1: " + MergeKLists.toString(res1));

        // Example 2:
        ListNode b1 = new ListNode(10, new ListNode(12));
        ListNode b2 = new ListNode(13);
        ListNode b3 = new ListNode(5, new ListNode(6));
        ListNode[] lists2 = new ListNode[]{b1, b2, b3};
        ListNode res2 = MergeKLists.mergeKLists(lists2);
        System.out.println("Output 2: " + MergeKLists.toString(res2));
    }
}
