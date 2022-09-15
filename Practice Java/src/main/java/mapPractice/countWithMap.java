package mapPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countWithMap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2, 4, 5, 6, 5, 4, 6};
        String[] str = {"java", "pyhton", "c#", "c++", "java", "java"};
        countInt(arr, arr.length);
        countString(str, str.length);
//        we can provide array of chars or we can use method to conver array to char. also the second vlaue should be size of char array.
        countChar(convertStringArrayToCharArray(str), convertStringArrayToCharArray(str).length);
    }

    public static void countInt(int[] arr, int arrSize) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrSize; i++) {
//          this will check our map if its empty. we already have the value then we get the value of arr[index] and add +1 to value.
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
//                esle we just add the value from array and assign number 1;
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }

    public static void countString(String[] arr, int arrSize) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrSize; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], +1);
            }
        }
        System.out.println(map);
    }

    public static void countChar(char[] arr, int arrSize) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arrSize; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], +1);
            }
        }
        System.out.println(map);
    }


    public static char[] convertStringArrayToCharArray(String[] arrString) {
        char[] arrChar = new char[arrString.length];
        String temp = "";
        for (int i = 0; i < arrString.length; i++) {
            temp = temp + arrString[i];
            arrChar = temp.toCharArray();
        }
        return arrChar;
    }

}
