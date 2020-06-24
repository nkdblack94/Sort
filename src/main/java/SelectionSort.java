public class SelectionSort {
    public static void main(String[] args) {
        double[] arr = {1, 5, 3, 8, 6, 2};
        selectionSort(arr);
        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[iMin] > array[j]) {
                    double temp = array[iMin];
                    array[iMin] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
