package Javidan;

import java.util.Scanner;

public class ifElse4 {

    public static void main(String[] args) {

        System.out.println("choose the action: ");

        System.out.println("1. add");
        System.out.println("2. substract");
        System.out.println("3. multiply");
        System.out.println("4. divide");

        Scanner scanner = new Scanner(System.in);
        System.out.print("your option: ");
        int option = scanner.nextInt();

        scanner.nextLine();

        System.out.print("enter first name: ");
        String firstName = scanner.nextLine();


        System.out.print("enter last name: ");
        String lastName = scanner.nextLine();

        if (option == 1) {
            System.out.println("you chose add service");

        } else if (option == 2) {
            System.out.println("you chose substracy service");

        } else if (option == 3) {
            System.out.println("you chose multiply service");

        } else if (option == 4) {
            System.out.println("you chose division service");

        } else {
            System.out.println("wrong input");
        }


    }
}