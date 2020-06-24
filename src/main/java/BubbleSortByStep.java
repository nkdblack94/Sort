public class BubbleSortByStep {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random()* 20 - 5);
        }

        displayArray(array);
        System.out.println("Sắp sếp lại");
        selectionSort(array);
        displayArray(array);
    }

    public static void selectionSort (int[] arr){
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++){
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void displayArray (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
