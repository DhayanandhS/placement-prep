class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null; // If the list is empty, return null
        }

        Node current = head;
        int total = 0;

        // Step 1: Calculate the total length of the list
        while (current != null) {
            total++;
            current = current.next;
        }

        // Step 2: Calculate the middle index
        int midIndex = total / 2;

        // Step 3: Traverse the list again to reach the middle node
        current = head; // Reset current to head
        for (int i = 0; i < midIndex; i++) {
            current = current.next;
        }

        // Print the data of the middle node
        System.out.println("Middle element is: " + current.data);

        return current; // Return the middle node
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = findMiddle(head);

        if (middle != null) {
            System.out.println("Middle node data: " + middle.data); // Output: 3
        } else {
            System.out.println("The list is empty.");
        }
    }
}

