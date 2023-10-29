package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 29, 12, 45, 7, 33 };
        int arr2[] = { 90, 18, -5, 58, 0 };
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        insertionSort.insertionSort(arr2);

        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(arr2));

        // output: 7, 12, 29, 33, 45
        System.out.print("Sorted: ");
        Arrays.stream(arr).forEach(number -> {
            System.out.print(number);
            if (number != arr[arr.length - 1]) {
                System.out.print(", ");
            }
        });
    }

    public void insertionSort(int arr[]) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j > -1 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void selectionSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
}
