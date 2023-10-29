package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr1[] = { 20, 8, 1, 23, 19 };
        int arr2[] = { 0, -8, 10, 8, 0 };
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr1);
        bubbleSort.bubbleSort(arr2);
        System.out.println("Sorted: " + Arrays.toString(arr1));
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }

    public void bubbleSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
