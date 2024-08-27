package assignments;

import java.util.HashMap;
import java.util.Map;

public class Person {
    // Instance variable
    private String name = "";

    // Constructor that takes a parameter and assigns it to the name variable
    public Person(String name) {
        this.name = name;
    }

    // Getter method to access the name variable
    public String getName() {
        return name;
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating an array of Person objects with size 3
        Person[] people = new Person[3];

        // Creating Person objects and assigning them to index 1 and 2
        people[1] = new Person("Alice");
        people[2] = new Person("Bob");

        // Printing the names of the persons
        System.out.println("Person at index 1: " + people[1].getName());
        System.out.println("Person at index 2: " + people[2].getName());

        // Exception in thread "main" java.lang.NullPointerException
        // THE GOAL of this assignment to validate your skill about excetion. I tried to code it from my memory but I may miss something the logic here the code should return
        // null pointer exception
//        Explanation:
//        The array people is initialized with a size of 3, so all elements in the array are initially set to null.
//                When you attempt to call getName() on people[0], it tries to dereference the null value, leading to a NullPointerException.


        // Given an array of string
        // return a Map<String, Integer> with a
        //* key for each different string, with the value the number of times that string appears in the array.
        //* wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
        //* wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
        //* wordCount(["c", "c", "c", "c"]) → {"c": 4}

        String[] input1 = {"a", "b", "a", "c", "b"};
        String[] input2 = {"c", "b", "a"};
        String[] input3 = {"c", "c", "c", "c"};

        System.out.println(wordCount(input1)); // Output: {"b": 2, "c": 1, "a": 2}
        System.out.println(wordCount(input2)); // Output: {"b": 1, "c": 1, "a": 1}
        System.out.println(wordCount(input3)); // Output: {"c": 4}


    }

    public static Map<String, Integer> wordCount(String[] input){
        Map<String, Integer> map = new HashMap<>();

        for (String word : input) {
            // If the word is already in the map, increment its count
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                // Otherwise, add the word to the map with a count of 1
                map.put(word, 1);
            }
        }
        return map;
    }
}
