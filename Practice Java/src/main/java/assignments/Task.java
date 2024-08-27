package assignments;

public class Task {

    // we have a string with random value. write a code to remove all x from the value except 1 and last one. for example xerxrx the code should return xerrx.
// they asked me questions about run time how to make it to run fast. thats why I used string builder. make research and create a method so you can talk about run time.
    public static void main(String[] args) {
        System.out.println(removeX("xxHxix")); // xHix output
        System.out.println(removeX("xabxxxcdx")); //xabcdx output
        System.out.println(removeX("abxxxcdx")); // abcdx  output
        System.out.println(removeX("xgggg")); // xgggg  output
        System.out.println(removeX("xhtjx")); // xhtjx  output
        System.out.println(removeX("xxxx")); // xx  output
        System.out.println(removeX("pgjh")); // pgjh  outputpghj
        System.out.println(removeX("xxwqxc")); // pgjh  outputpghj
    }

    public static String removeX(String input) {
        // Find the index of the first 'x'
        int firstIndex = input.indexOf('x');

        // Find the index of the last 'x'
        int lastIndex = input.lastIndexOf('x');

        // If there are no matching x based on AC, then return the value itself
        if (firstIndex == lastIndex) {
            return input;
        }

        // Build the result, keeping only the first and last 'x'
        StringBuilder result = new StringBuilder();
//        StringBuffer result = new StringBuffer();

        // Append characters between the first and last 'x', excluding any 'x'
        if (input.indexOf('x') == 0 && input.lastIndexOf('x') == input.length() - 1) {
            result.append(input, 0, firstIndex + 1);
            for (int i = firstIndex + 1; i < lastIndex; i++) {
                if (input.charAt(i) != 'x') {
                    result.append(input.charAt(i));
                }
            }
            result.append(input, lastIndex, lastIndex + 1);
        } else {
            result.append(input, 0, 1);
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) != 'x') {
                    result.append(input.charAt(i));
                }
            }
        }
        return result.toString();
    }
}