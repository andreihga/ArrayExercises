import java.util.Scanner;

/*
Take 10 integer inputs from user and store them in an array.
Again ask user to give a number.
Now, tell user whether that number is present in array or not.
*/
public class FindNumberGiven {
    Scanner s = new Scanner(System.in);
    int[] array = new int[5];

    public void readValues() {
        System.out.print("Enter 5 values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
    }

    public void searchForNumber(int number) {
        int count = 0;
        for (int i : array) {
            if (i == number) {
                count++;
            }
        }
        if (count != 0)
            System.out.println("the number is present on array " + count + " times.");
        else
            System.out.println("the number is not on the array");

    }

    public static void main(String[] args) {
        FindNumberGiven exercise2 = new FindNumberGiven();
        exercise2.readValues();

        System.out.print("Enter the number you want to verify ");
        int number = exercise2.s.nextInt();
        exercise2.searchForNumber(number);
    }
}
