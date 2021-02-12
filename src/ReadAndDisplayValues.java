import java.util.Scanner;

// https://www.codesdope.com/practice/java-array/
//Take 10 integer inputs from user and store them in an array and print them on screen.
public class ReadAndDisplayValues {
    Scanner s = new Scanner(System.in);

    public int[] readValues() {
//        System.out.println("Enter 5 values: ");
        System.out.print("How big the array should be? ");
        int length = s.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value of array[" + i + "]");
            array[i] = s.nextInt();
        }
        return array;
    }

    public void displayValues(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            ReadAndDisplayValues exercise = new ReadAndDisplayValues();

            exercise.displayValues(exercise.readValues());

            System.out.println("wanna do that again? y/n");
            String response = exercise.s.next();

            boolean isInSwich = true;

            while (isInSwich) {
                switch (response) {
                    case "N", "n" -> {
                        isRunning = false;
                        System.out.println("sayonara");
                        isInSwich = false;
                    }
                    case "Y", "y" -> isInSwich = false;
                    default -> {
                        System.out.println("you must enter y or n");
                        response = exercise.s.next();
                    }
                }
            }
        }
    }
}
