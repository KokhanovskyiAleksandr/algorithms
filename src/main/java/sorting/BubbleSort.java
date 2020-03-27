package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sort = sort(new int[]{5, 8, 3, 1, 5, 8, 3, 1, 5, 3, 7});
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array) {
        boolean needSorting = true;
        while (needSorting) {
            needSorting = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needSorting = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void swap(int[] array, int less, int more) {
        int temp = array[less];
        array[less] = array[more];
        array[more] = temp;
    }
}
