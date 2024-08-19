import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the array with size 5
        int size = 5;
        int[] arr = {1, 20, 5, 78, 30};

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Enter element to delete:");
        int key = scanner.nextInt();
        
        // Find the index of the element to delete
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Create a new array with one less size
            int[] newArr = new int[size - 1];

            // Copy elements to the new array, skipping the deleted element
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            for (int i = index; i < size - 1; i++) {
                newArr[i] = arr[i + 1];
            }

            // Print the updated array
            System.out.println("New Array:");
            printArray(newArr);
        } else {
            System.out.println("Element Not Found");
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

