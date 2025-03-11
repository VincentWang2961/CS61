public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int counter = 0;
        for (int i = 0; i < matrix.length; i += 1) {
            for (int j = 0; j < matrix[i].length; j += 1) {
                matrix[i][j] = counter;
                counter += 1;
            }
        }
        for (int i = 0; i < matrix.length; i += 1) {
            for (int j = 0; j < matrix[i].length; j += 1) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix test
        System.out.println("Matrix test");
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][1]);
    }
}
