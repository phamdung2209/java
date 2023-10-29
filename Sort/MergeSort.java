package Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 2, 1 };
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        mergeSort(arr, left, mid, right);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // merge sort: 
    public static void mergeSort(int[] arr, int left, int mid, int right) {
        // base case: 
        if (left >= right) {
            return;
        }

        // recursive case: 
        mergeSort(arr, left, (left + mid) / 2, mid);
        mergeSort(arr, mid + 1, (mid + 1 + right) / 2, right);

        // merge: 
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }
}
