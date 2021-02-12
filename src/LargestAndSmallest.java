//Find largest and smallest elements of an array.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LargestAndSmallest {
    public List<Integer> getLargestAndSmallest(int[] array, ReadAndDisplayValues readAndDisplayValues) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1;j<array.length;j++ ){

                    if (array[i] > array[j]) {
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                readAndDisplayValues.displayValues(array);
            }

        }
        List<Integer> list = new LinkedList<>();
        list.add(array[0]);
        list.add(array[array.length - 1]);
        return list;
    }

    public void secondMethod(int[] array){
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("max value: " + maxValue);
        System.out.println("min value: " + minValue);
    }

    public static void main(String[] args) {
        ReadAndDisplayValues read = new ReadAndDisplayValues();
        LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
        int[] array = read.readValues();
        List<Integer> list = largestAndSmallest.getLargestAndSmallest(array,read);
        System.out.println("the smallest is " + list.get(0));
        System.out.println("the largest is " + list.get(1));
        largestAndSmallest.secondMethod(array);
    }
}

