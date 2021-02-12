/*Consider an integer array, the number of elements in which is determined by the user.
The elements are also taken as input from the user.
Write a program to find those pair of elements that has the maximum and minimum among all element pairs.*/
public class MinAndMaxOfGroups {
    public void checkMinAndMax(int[] array) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int index4 = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] < minValue && i!=j ) {
                    minValue = array[i] + array[j];
                    index1 = i;
                    index2 = j;
                }
                if (array[i] + array[j] > maxValue && i!=j) {
                    maxValue = array[i] + array[j];
                    index3 = i;
                    index4 = j;
                }
            }
        }
        System.out.println("min value has index " + index1 +" & "+index2);
        System.out.println("max value has index " + index3 +" & "+index4);
    }

    public static void main(String[] args) {
        ReadAndDisplayValues readAndDisplayValues = new ReadAndDisplayValues();
        MinAndMaxOfGroups minAndMaxOfGroups = new MinAndMaxOfGroups();
        minAndMaxOfGroups.checkMinAndMax(readAndDisplayValues.readValues());
    }
}
