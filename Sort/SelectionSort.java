package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        Arrays.stream(arr).forEach(number -> {
            System.out.print(number);
            if (number != arr[arr.length - 1]) {
                System.out.print(", ");
            }
        });
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
