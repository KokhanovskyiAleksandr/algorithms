public class BinarySearch {
    public static void main(String[] args) {
        Integer i = searchElementIndex(new int[]{1, 3, 5, 7, 8, 9, 15, 24, 32}, 9);
        System.out.println(i);
    }


    public static Integer searchElementIndex(int[] array, int needToFind) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int middle = (low + high) / 2;

            if (array[middle] == needToFind) {
                return array[middle];
            }
            if (array[middle] < needToFind) {
                low = middle + 1;
            }
            if (array[middle] > needToFind) {
                high = middle - 1;
            }
        }
        return null;
    }
}
