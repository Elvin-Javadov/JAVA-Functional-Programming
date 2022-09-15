package assignments;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeStringBuilder("Level"));
        System.out.println(isPalindromeStringBuilder("Love"));
        System.out.println(isPalindromeStringManipulation("Level"));
        System.out.println(isPalindromeStringManipulation("Love"));

    }


    public static boolean isPalindromeStringBuilder(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equalsIgnoreCase(str);
    }

    public static boolean isPalindromeStringManipulation(String str) {
        String reversed = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            reversed = reversed + ch[i];
        }
        return str.equalsIgnoreCase(reversed);
    }
}
