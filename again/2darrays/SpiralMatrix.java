
class SpiralMatrix {

    public static void printSpiral(int[][] matrix) {
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int startingRow = 0;
        int endingRow = n - 1;
        int EndingColumn = m - 1;
        int StatrtingColumn = 0;

        while (startingRow <= endingRow && StatrtingColumn <= EndingColumn) {
            // top boundary
            for (int j = StatrtingColumn; j <= EndingColumn; j++) {
                System.out.print(matrix[startingRow][j] + " ");
            }

            // right boundary
            for (int i = startingRow + 1; i <= endingRow; i++) {
                System.out.print(matrix[i][EndingColumn] + " ");

            }

            // bottom boundary
            for(int j = EndingColumn - 1 ; j >= StatrtingColumn; j--) {
                System.out.print(matrix[endingRow][j] + " ");
                
            }

            // left boundary
            for(int i=endingRow-1; i >= startingRow + 1;i--) {
                System.out.print(matrix[i][StatrtingColumn] + " ");
            }

            startingRow++;
            StatrtingColumn++;

            EndingColumn--;
            endingRow--;

        }

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

        printSpiral(matrix);
    }
}
