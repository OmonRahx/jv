import java.util.Random;

public class Main {
    static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] originalMatrix = createMatrix(SIZE);
        System.out.println("Оригинальная матрица:");
        printMatrix(originalMatrix);
        int[][] rotatedMatrix = rotateMatrix(originalMatrix);
        System.out.println("Перевернутая матрица:");
        printMatrix(rotatedMatrix);


    }

    public static int[][] rotateMatrix(int[][] originalMatrix) {
        int[][] result = new int[originalMatrix.length][originalMatrix.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = originalMatrix[originalMatrix.length - 1 - j][i];
            }
        }
        return result;
    }


    public static int[][] createMatrix(int size) {
        Random random = new Random();
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = random.nextInt(256);
            }
        }
        return result;
    }


    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
