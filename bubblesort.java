import java.util.*;

class bubblesort {
    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 1, 2};

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}