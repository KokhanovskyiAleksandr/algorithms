package sorting;

import java.util.Arrays;

//todo realize
public class QuickSort {
    public static void main(String[] args) {
        int[] sorted = new QuickSort().sort(new int[]{7, 6, 2, 4, 1});
        System.out.println(Arrays.toString(sorted));
    }

    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                left[leftCount] = array[i];
                leftCount++;
            } else {
                right[rightCount] = array[i];
                rightCount++;
            }
        }
        left = trimArray(leftCount, left);
        right = trimArray(rightCount, right);

        int[] leftSort = sort(left);
        int[] rightSort = sort(right);

        return merge(leftSort, rightSort);
    }

    private int[] trimArray(int i, int[] oldArray) {
        int[] array = new int[i];

        for (int j = 0; j < array.length; j++) {
            array[j] = oldArray[j];
        }
        return array;
    }

    public int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (leftCount == left.length) {
                sorted[i] = right[rightCount];
                rightCount++;
            } else if (rightCount == right.length) {
                sorted[i] = left[leftCount];
                leftCount++;
            } else {
                if (left[leftCount] < right[rightCount]) {
                    sorted[i] = left[leftCount];
                    leftCount++;
                } else {
                    sorted[i] = right[rightCount];
                    rightCount++;
                }
            }
        }
        return sorted;
    }
}
