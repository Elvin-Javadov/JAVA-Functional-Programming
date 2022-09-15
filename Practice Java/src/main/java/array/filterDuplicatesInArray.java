package array;

import java.util.Arrays;

public class filterDuplicatesInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 6,6,6,6,6,66,7,65};

        System.out.println(Arrays.toString(filterDuplicatesWithStream(a)));
    }

//for different way look to map
    public static int[] filterDuplicatesWithStream(int[] arr){
        arr = Arrays.stream(arr).distinct().toArray();
        return arr;
    }
}
