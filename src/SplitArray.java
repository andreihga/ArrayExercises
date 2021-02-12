//Take an array of 10 elements. Split it into middle and store the elements in two different arrays.
public class SplitArray {
    public void splitArray(int[] array, ReadAndDisplayValues display){
        int[] firstHalf = new int[array.length/2];
        int[] secondHalf = new int[array.length-firstHalf.length];

        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = array[i];
        }
        display.displayValues(firstHalf);
        int j = 0;
        for (int i = firstHalf.length; i < array.length; i++) {
            secondHalf[j] = array[i];
            j++;
        }
        display.displayValues(secondHalf);
    }

    public static void main(String[] args) {
        ReadAndDisplayValues readAndDisplayValues = new ReadAndDisplayValues();
        SplitArray splitArray = new SplitArray();
        splitArray.splitArray(readAndDisplayValues.readValues(),readAndDisplayValues);
    }
}
