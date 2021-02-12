import java.util.Scanner;

/*Take 20 integer inputs from user and print the following:
        number of positive numbers
        number of negative numbers
        number of odd numbers
        number of even numbers
        number of 0s.*/
public class classifyElementInArray {
    Scanner scanner = new Scanner(System.in);
    ReadAndDisplayValues read = new ReadAndDisplayValues();

    /*    public void readValues(){
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }*/
    public void sortValues() {

        int positives = 0, negatives = 0, odds = 0, evens = 0;

        int[] array = read.readValues();

        for (int j : array) {
            if (j > 0)
                positives++;
            if (j < 0)
                negatives++;
            if (j % 2 == 0)
                evens++;
            if (j % 2 != 0)
                odds++;
        }
        System.out.println("there are " + positives + " positive numbers");
        System.out.println("there are " + negatives + " negative numbers");
        System.out.println("there are " + evens + " even numbers");
        System.out.println("there are " + odds + " odd numbers");
    }

    public static void main(String[] args) {
        classifyElementInArray sort = new classifyElementInArray();
        sort.sortValues();
    }
}
