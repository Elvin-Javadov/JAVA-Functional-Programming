package assignments;

public class Factorial {
    public static void main(String[] args) {
        findFactorial(-6);
        findFactorial(0);
        findFactorial(2);
        findFactorial(6);
    }

    public static int findFactorial(int number) {
        int sum = 1;
//        sum ne dolzhen bit 0 na 0 umnozhat nelza
        if (number <= 0) {
            System.out.println("Factorial of " + number + " is " + sum);
            return sum;
        }

        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        System.out.println("Factorial of " + number + " is " + sum);
        return sum;
    }


}
