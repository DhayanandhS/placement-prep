import java.util.Scanner;

public class P48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the array with size 5
        int size = 5;
        int[] arr = {1, 20, 5, 78, 30};

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Enter position and element:");
        int pos = scanner.nextInt();
        int element = scanner.nextInt();

        // Check for valid position
        if (pos >= 0 && pos <= size) {
            // Create a new array with increased size
            int[] newArr = new int[size + 1];

            // Copy elements to new array and insert the new element
            for (int i = 0; i < pos; i++) {
                newArr[i] = arr[i];
            }
            newArr[pos] = element;
            for (int i = pos; i < size; i++) {
                newArr[i + 1] = arr[i];
            }

            // Print the updated array
            System.out.println("Updated array:");
            printArray(newArr);
        } else {
            System.out.println("Invalid Position");
        }

        scanner.close();
    }

    // Utility method to print the array
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
