package zuoShen.zuoShen01;

import java.util.Arrays;

public class class02_insert_Sort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }



    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {

        int[] arr = {10, 9, 13, 89, 35, 31, 11, 35, 30, 23};
        System.out.print("排序前的序列为： ");
        printArray(arr);
        insertionSort(arr);
        System.out.print("排序后的序列为： ");
        printArray(arr);
    }

}
