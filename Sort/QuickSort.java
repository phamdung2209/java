package Sort;

public class QuickSort {
    public static void main(String[] args) {
        // int[] arr = { 5, 8, 7, 2, 1 };
        int[] arr = { 5, 8, 7, 2, 1, 9, 3, 4, 6 };
        int left = 0;
        int right = arr.length - 1;

        quickSort(arr, left, right);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }

    // Quick sort
    public static void quickSort(int[] arr, int left, int right) {
        // base case: 
        if (left >= right) {
            return;
        }

        // recursive case: 
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    // partition:
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);

        return i + 1;
    }

    // swap:
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
