import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );

        String line = scanner.nextLine ();
        String[] numbers = line.split ( " " );

        int[] realNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            realNumbers[i] = Integer.parseInt ( numbers[i] );
            try {
                realNumbers[i] = Integer.parseInt ( numbers[i] );
            } catch (Exception e) {
                System.out.println(numbers[i] + " Not int number!!!");
            }

            for (int realNumber : realNumbers) {
                System.out.println ( realNumber );
            }
            System.out.println ();
        System.out.println ( "Your array size is :" + realNumbers.length );
    }
}}