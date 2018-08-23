package zuoShen.zuoShen01;

import java.util.Arrays;

public class class01_bubble_Sort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
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
        bubbleSort(arr);
        System.out.print("排序后的序列为： ");
        printArray(arr);
    }

}