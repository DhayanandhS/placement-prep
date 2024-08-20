class Solution
{
	int select(int arr[], int i) {
        // We are selecting the minimum element for the ith position
        return arr[i];
    }

    void selectionSort(int arr[], int n) {
        // Implementing selection sort
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum element is the ith element
            int minIndex = i;

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the ith element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
