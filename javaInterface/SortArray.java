package javaInterface;

import java.util.Arrays;

interface Sortable {
    int[] sort(int[] array);
}

class BubbleSort implements Sortable {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

class SelectionSort implements Sortable {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }
}


public class SortArray {
    public static void main(String args[]) {
        // int[] array = {5, 2, 9, 1, 5, 6};
        // int[] bubbleSortedArray = new BubbleSort().sort(array);
        // System.out.println(Arrays.toString(bubbleSortedArray));

        // int[] selectionSortedArray = new SelectionSort().sort(array);
        // System.out.println(Arrays.toString(selectionSortedArray));
        System.err.println("Hello World");
    }
}
