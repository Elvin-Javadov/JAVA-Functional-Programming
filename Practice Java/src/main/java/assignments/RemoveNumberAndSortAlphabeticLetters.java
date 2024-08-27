package assignments;

import java.util.Arrays;

public class RemoveNumberAndSortAlphabeticLetters {


    public static void main(String[] args) {
        String input = "A432p2p454le$%";
        String sortedResult = sortLettersAlphabetically(input);
        System.out.println(sortedResult); // Output will be "Aelpp"
    }

    public static String sortLettersAlphabetically(String str) {
        // Step 1: Remove non-alphabetic characters
        String onlyLetters = str.replaceAll("[^a-zA-Z]", "");

        // Step 2: Convert the string to a character array
        char[] charArray = onlyLetters.toCharArray();

        // Step 3: Sort the character array
        Arrays.sort(charArray);

        // Step 4: Convert the sorted character array back to a string
        return new String(charArray);
    }
}


