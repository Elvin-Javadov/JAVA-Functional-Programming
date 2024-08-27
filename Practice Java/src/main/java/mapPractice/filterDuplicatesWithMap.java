package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class filterDuplicatesWithMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2, 4, 5, 6, 5, 4, 6};

        removeDuplicates(arr, arr.length);
    }


    public static void removeDuplicates(int[] arr, int arrSize) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arrSize; i++) {

            if (map.get(arr[i]) == null) {
//                so its mean we r taking spot of map index i for example 1. and adding true. next time when
//                it checks key and sees 1 it false and moves to next
                System.out.print(arr[i] + " ");
                map.put(arr[i], true);

            }
        }
    }


}
