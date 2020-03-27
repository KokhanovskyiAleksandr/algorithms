package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MergeSort().split(new int[]{1, 7, 5, 4, 3})));
    }

    public int[] split(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int[] left = new int[array.length / 2];
        System.arraycopy(array, 0, left, 0, array.length / 2);

        int[] right = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, right, 0, array.length - array.length / 2);

        left = split(left);
        right = split(right);
        return merge(left, right);
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
