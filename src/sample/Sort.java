package sample;

public class Sort {
    public static void bubbleSort(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
               if (array[j] < array[j-1]){
                   aux = array[j];
                   array[j] = array[j-1];
                   array[j] = aux;
               }
            }
        }
    }

    public static void bubbleSortAdaptive(int[] array) {
        int aux;
        boolean flag = false;
        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j] < array[j-1]){
                    aux = array[j];
                    array[j] = array[j-1];
                    array[j] = aux;
                    flag = true;
                }
            }
            if (!flag) break;
            else flag = false;
        }
    }


    public static void selectionSort(int[] array) {
        int aux, min_idx;
        for (int i = 0; i < array.length; i++){
            min_idx = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min_idx])
                    min_idx = j;
            }
            aux = array[i];
            array[i] = array[min_idx];
            array[i] = aux;
        }
    }


    public static void insertionSort(int[] array) {
        int aux;
        for (int right = 1; right < array.length; right++){
            for (int left = right ; array[left] < array[left-1] && left > 0; left--){
                aux = array[left];
                array[left] = array[left-1];
                array[left-1] = aux;
            }
        }
    }

    public static void insertionSortAdaptive(int[] array) {
        int aux, min_idx;
        min_idx = 0;
        for (int j = 1; j < array.length; j++){
            if (array[j] < array[min_idx])
                min_idx = j;
        }
        aux = array[0];
        array[0] = array[min_idx];
        array[0] = aux;

        for (int right = 2; right < array.length; right++){
            for (int left = right ; array[left] < array[left-1]; left--){
                aux = array[left];
                array[left] = array[left-1];
                array[left-1] = aux;
            }
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) return;

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        divide(array, left, right);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);

    }

    private static void divide(int[] a, int[] left, int[] right) {
        int i;
        for (i = 0; i < left.length; i++) left[i] = a[i];
        for (i = 0; i < right.length; i++) right[i] = a[left.length + i];
    }

    private static void merge(int[] a, int[] left, int[] right) {
        int l = 0, r = 0, i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r])
                a[i++] = left[l++];
             else
                a[i++] = right[r++];
        }

        while (l < left.length)
            a[i++] = left[l++];

        while (r < right.length)
            a[i++] = right[r++];

    }

}
