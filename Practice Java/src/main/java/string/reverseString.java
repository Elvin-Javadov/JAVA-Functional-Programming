package string;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseWithSimpleString("lets get this job"));

        reverseWithStringBuilder();

    }



    public static String reverseWithSimpleString(String str) {
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            str = str + ch[i];
        }
        return str;
    }

    public static void reverseWithStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello World");

        /*
         * or we can create first String str = "Hello WOrld";
         * then we create StringBUilder with value of str
         * StringBuilder stringBuilder = new StringBuilder(str);
         * */

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
    }
}
