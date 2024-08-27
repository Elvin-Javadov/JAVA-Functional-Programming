package assignments;

public class Task {



    // we have a string with random value. write a code to remove all x from the value except 1 and last one. for example xerxrx the code should return xerrx.
//    they asked me questions about run time how to make it to run fast. thats why I used string builder. make research and create a method so you can talk about run time.
    public static void main(String[] args) {
        System.out.println(removeX("xxHxix")); // xHix output
        System.out.println(removeX("xabxxxcdx")); //xabcdx output
        System.out.println(removeX("abxxxcdx")); // abcdx  output
    }

    public static String removeX(String str) {

        char[] ch = str.toCharArray();
        StringBuilder temp = new StringBuilder();
        temp.append(ch[0]);

        for (int i = 1; i < ch.length - 1; i++) {
            if (ch[i] != 'x') {
                temp.append(ch[i]);
            }
        }

        temp.append(ch[ch.length - 1]);
        return temp.toString();
    }

}
