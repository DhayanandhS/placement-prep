public class Solution
{
    public static Node findMiddle(Node head)
    {
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

        return current; // Return the middle node
    }
}