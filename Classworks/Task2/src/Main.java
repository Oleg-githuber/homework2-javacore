public class Main {
    public static void main(String[] args) {
        int matrixSize = 5;
        int[][] matrix = new int[matrixSize][matrixSize];
        System.out.println("Матрица до обработки:");
        printMatrix(matrix);
        System.out.println("Матрица после обработки:");
        setOneToDiagonale(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] arr) {
        for (int[] raw : arr) {
            for (int number : raw) {
                System.out.print(number);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void setOneToDiagonale(int[][] arr) {
        int arrLength = arr.length;
        for (int raw = 0; raw < arrLength; ++raw) {
            for (int column = 0; column < arrLength; ++column) {
                if ((raw == column) || ((raw + column) == (arrLength - 1))) {
                    arr[raw][column] = 1;
                }
            }
        }
    }
}