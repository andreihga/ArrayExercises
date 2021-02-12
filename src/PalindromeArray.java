//Write a program to check if elements of an array are same or not it read from front or back.
public class PalindromeArray {
    public void checkArray(int[] array){
        int j = array.length-1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[j]){
                count++;
            }
            j--;
        }
        if (count == 0){
            System.out.println("array palindrome");
        } else {
            System.out.println("not an array palindrome");
        }
    }

    public static void main(String[] args) {
        ReadAndDisplayValues readAndDisplayValues = new ReadAndDisplayValues();
        PalindromeArray palindromeArray = new PalindromeArray();
        palindromeArray.checkArray(readAndDisplayValues.readValues());
    }
}
