package assignments;

public class Armstrong {
    public static void main(String[] args) {
        armstrong(153);
        armstrong(75);
        armstrong(371);
        armstrong(370);
        armstrong(470);
        armstrong(407);
        armstrong(408);
    }


    public static void armstrong(int number ){
        int sum = 0;
        int digit;
        int temp = number;

        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if (number == sum) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }
}
