public class Circular {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            
            return newNode;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode; 
        newNode.next = head; 
        return head;
    }

    public static void display(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        int values[] = {1, 2, 3, 4, 5};
        for (int value : values) {
            head = insert(head, value);
        }
        display(head);
    }
}