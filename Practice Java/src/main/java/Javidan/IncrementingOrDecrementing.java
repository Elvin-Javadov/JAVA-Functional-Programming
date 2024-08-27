package Javidan;

public class IncrementingOrDecrementing {
    public static void preIncrement() {
        int x = 5;
        int y = ++x; // Increment x first, then assign it to y

        System.out.println("x: " + x); // x is now 6
        System.out.println("y: " + y); // y is also 6

    }

    public static void postIncrement() {
        int a = 5;
        int b = a++; // Assign a to b, then increment a

        System.out.println("a: " + a); // a is now 6
        System.out.println("b: " + b); // b is 5 because it gets the original value of a

    }

    public static void main(String[] args) {
        preIncrement();
        postIncrement();
    }

}

