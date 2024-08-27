package assignments;

public class RemoveLettersKeepNumberAndReturnSUM {
    public static void main(String[] args) {
        String input = "abc123def456ghi789";
        int sum = sumOfNumbers(input);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static int sumOfNumbers(String str) {
        // Replace all non-digit characters with a space
        String[] numbers = str.replaceAll("[^0-9]", " ").split("\\s+");
        int sum = 0;

        // Iterate through the resulting array of numbers
        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}


