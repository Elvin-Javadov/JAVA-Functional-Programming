package intPractice;

public class intReverse {
    public static void main(String[] args) {
        System.out.println(reverseIntWithWhile(1469));
        System.out.println(reverseIntWithForLop(1469));

    }

    public static int reverseIntWithWhile(int num) {
        int reversed = 0;
        while (num != 0) {
//            so while num is not equal to 0 continue to loop.
            int temp = num % 10;
//        int temp we save the value of num devided to 10. which is 9.
            reversed = reversed * 10 + temp;
//        we take the existing value of reversed which starts with 0 * 10 and add temp value. now the value is 9.
//        then we 9*10 and value will be 90 + next temp which is 6
            num = num / 10;
//        after each step we need to make sure we delete the value from num so it goes down to 0;
        }
        return reversed;
    }

    public static int reverseIntWithForLop(int num) {
        int reversed = 0;
        for (; num != 0; num = num / 10) {
            int temp = num % 10;
            reversed = reversed * 10 + temp;
        }

        return reversed;
    }
}
