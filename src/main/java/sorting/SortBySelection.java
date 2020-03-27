package sorting;

import java.util.Arrays;


public class SortBySelection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortBySelection().sort(new int[]{5, 2, 4, 23, 1, 6, 9, 3})));
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }
        return array;
    }

    public void swap(int[] array, int less, int more) {
        int temp = array[less];
        array[less] = array[more];
        array[more] = temp;
    }
}
