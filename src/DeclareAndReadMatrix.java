//Initialize and print all elements of a 2D array.
import java.util.Scanner;

public class DeclareAndReadMatrix {

    public int[][] declareMatrix(Scanner scanner) {
        System.out.print("how many rows? ");
        int rows = scanner.nextInt();
        System.out.print("how many columns? ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter values for matrix["+i+"]["+j+"] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        for (int[] array : matrix){
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeclareAndReadMatrix declareAndReadMatrix = new DeclareAndReadMatrix();
        declareAndReadMatrix.displayMatrix(declareAndReadMatrix.declareMatrix(scanner));
    }
}
