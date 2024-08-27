import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public  class StaticSample {


    public void noStaticMethod() {
        System.out.println("This is no Static Method");
    }

    public static void staticMethod() {
        System.out.println("This is Static Method");
    }




//        Features of static method:
//
//        A static method in Java is a method that is part of a class rather than an instance of that class.
//        Every instance of a class has access to the method.
//        Static methods have access to class variables (static variables) without using the class’s object (instance).
//                Only static data may be accessed by a static method. It is unable to access data that is not static (instance variables).
//        In both static and non-static methods, static methods can be accessed directly.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the last 100 winning numbers
        int[] winningNumbers = new int[100];
        System.out.println("Please enter the last 100 winning lottery numbers:");
        for (int i = 0; i < 100; i++) {
            winningNumbers[i] = scanner.nextInt();
        }

        // Calculate the chance of the next winning number
        int[] frequency = new int[100];
        for (int i = 0; i < 100; i++) {
            frequency[winningNumbers[i] - 1]++;
        }
        int maxFrequency = 0;
        int nextWinningNumber = 0;
        for (int i = 0; i < 100; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                nextWinningNumber = i + 1;
            }
        }
        double chance = (double) maxFrequency / 100;

        // Output the result
        System.out.println("The next winning lottery number has a " + chance + "% chance of being " + nextWinningNumber);
    }


}