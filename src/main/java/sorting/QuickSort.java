package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//todo realize
public class QuickSort {
    public static void main(String[] args) {
//        List<Integer>sorted = new QuickSort().sort(Arrays.asList(9, 8, 7, 6, 1, 2, 3, 4, 5, 6, 4, 2, 1));
//        System.out.println(sorted);
    }

    public List<Integer> sort(List<Integer> array) {
        if (array.size() < 2){
            return array;
        }
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < array.size() ; i++) {
            if (array.get(i) < array.get(0)){
                left.add(array.get(i));
            }else {
                right.add(array.get(i));
            }
        }
        List<Integer> leftSort = sort(left);

        return left;
    }
}
