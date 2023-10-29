package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // bubble sort
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        Main ob = new Main();
        ob.insertionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void bubbleSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // insertion sort
    public void insertionSort(int arr[]) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                // move elements greater than key to one position ahead
                arr[j + 1] = arr[j];
                j--;
            }
            // place key at correct position
            arr[j + 1] = key;
        }
    }

    public void insertionSort2(int arr[]) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    
}
