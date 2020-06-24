import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {11, 2, 6, - 21, 3, 4, 8, -3, 9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = arr[i];
            for (int j = i - 1; j >= 0 && index < arr[j]; j--) {
                arr[j + 1] = arr[j];
                arr[j] = index;
            }

        }
    }
}
