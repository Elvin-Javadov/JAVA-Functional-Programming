package functionalmap;

import java.util.*;

public class PowerballChance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the last 5 winning numbers
        int[][] winningNumbers = new int[5][5];
        System.out.println("Please enter the last 5 winning lottery numbers separated by comma:");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        for (int i = 0; i < 5; i++) {
            String[] num = numbers[i].trim().split(" ");
            for (int j = 0; j < 5; j++) {
                winningNumbers[i][j] = Integer.parseInt(num[j]);
            }
        }

        // Calculate the chance of the next winning numbers
        int[] frequency = new int[70];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                frequency[winningNumbers[i][j]]++;
            }
        }
        int maxFrequency = 0;
        List<Integer> nextWinningNumbers = new ArrayList<>();
        for (int i = 1; i <= 69; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                nextWinningNumbers.clear();
                nextWinningNumbers.add(i);
            } else if (frequency[i] == maxFrequency) {
                nextWinningNumbers.add(i);
            }
        }
        double chance = (double) maxFrequency / 5;

        // Output the result
        System.out.println("The next winning lottery numbers have a " + chance + "% chance of being:");
    }
}
