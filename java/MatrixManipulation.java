public class MatrixManipulation {
    public static void main(String[] args) {
        int[][] matrix1 = {{9,8,7}, {3,2,1}, {4,5,6}};
        int[][] matrix2 = {{3,2,1}, {6,5,4}, {9,8,7}};

        // Check if the matrices have the same number of rows and columns
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Error: Matrices have different dimensions.");
            return;
        }

        // Print original matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println();
        System.out.println("Matrix 2:");
        printMatrix(matrix2);


        // Matrix addition
        int[][] matrixSum = matrixAddition(matrix1, matrix2);
        System.out.println("Matrix Addition:");
        printMatrix(matrixSum);
        
        // Matrix subtraction
        int[][] matrixDiff = matrixSubtraction(matrix1, matrix2);
        System.out.println("Matrix Subtraction:");
        printMatrix(matrixDiff);

        // Matrix Multiplication 
        int[][] matrixProduct = matrixMultiplication(matrix1, matrix2);
        System.out.println("Matrix Multiplication");
        printMatrix(matrixProduct);

        // Matrix transpose 
        int[][] transposeResult = matrixTranspose(matrix1);
        System.out.println("Matrix transposing");
        printMatrix(transposeResult);
    }
    
    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] matrixSum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixSum;
    }
    
    public static int[][] matrixSubtraction(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] matrixDiff = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixDiff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixDiff;
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] matrixProduct = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixProduct[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return matrixProduct;
    }

    public static int[][] matrixTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixTranspose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixTranspose[j][i] = matrix[i][j];
            }
        }

        return matrixTranspose;
    }

    // Prints the matrices
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
