package arrays;

public class SearchA2DMatrix {
    public static int[][] createAnArray(int difference, int size) {
        int[][] array = new int[size][size];
        int temp = difference;
        int last = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = last + difference;
                last = array[i][j];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = createAnArray(3, 4);
        matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        if (matrix.length == 0) {
            System.out.println(false);
            return; // Matrix is empty
        }
        int cols = matrix[0].length;
        if (cols == 0) {
            System.out.println(false);
            return;
        }


        int target = 11;
        int last = matrix[0].length - 1;
        int row = 0;
        int high = matrix.length - 1;
        int low = 0;
        while (low <= high) {
            row = (low + high) / 2;
            if (matrix[row][0] == target) {
                System.out.println(true);
                return;
            }
            if (matrix[row][0] < target) {
                low = row + 1;
            } else {
                high = row - 1;
            }
        }

        if (high < 0) {
            System.out.println(false);
            return;
        }

        System.out.println(row);
        row = high;

        high = matrix[row].length - 1;
        int index = 0;
        low = 0;
        while (low <= high) {
            index = (low + high) / 2;
            if (matrix[row][index] == target) {
                System.out.println(true);
                return;
            }
            if (matrix[row][index] < target) {
                low = index + 1;
            } else {
                high = index - 1;
            }
        }
        System.out.println(false);
        return;
    }
}
