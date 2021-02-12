/*Take 10 integer inputs from user and store them in an array.
        Now, copy all the elements in an another array but in reverse order.*/
public class CopyArrayInReverse {
    public int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            reversedArray[j] = array[i];
            j++;
            // Arrays.fill(reversedArray, array[i]);
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        ReadAndDisplayValues read = new ReadAndDisplayValues();
        CopyArrayInReverse copyArrayInReverse = new CopyArrayInReverse();
        read.displayValues(copyArrayInReverse.reverseArray(read.readValues()));
    }
}
