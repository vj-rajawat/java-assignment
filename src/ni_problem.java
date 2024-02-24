import java.util.Scanner;

public class ni_problem {
    public static void main(String args[]) {
        int i, j;
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        int[][] sum = new int[5][5];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows of arr1: ");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns of arr1: ");
        // before arr2 Now arr1
        int column = s.nextInt();
        System.out.println("Enter arr1 elements: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < column; j++) {
                arr1[i][j] = s.nextInt();
            }
        } // Before curly braces end at last
          // After i close here
          // Because of this array cannot read the value of array
        System.out.println("Array1 is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < column; j++) {
                System.out.printf(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number of rows of arr2: ");
        int row = s.nextInt();
        System.out.println("Enter the number of columns of arr2: ");
        int columns = s.nextInt();
        System.out.println("Enter arr2 elements: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < columns; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        System.out.println("Array2 is: ");
        for (i = 0; i < row; i++) {
            // Before name is rows so it get the upper value
            // After name is row so it get the correct enter array2 value
            for (j = 0; j < columns; j++) {
                // Here also the same problem name column
                // After change the columns
                // Due to this columns get the array1 column value and show wrong value
                System.out.printf(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of two array is: ");
        int large_row;
        int large_column;
        if (row < rows) {
            large_row = rows;
        } else {
            large_row = row;
        }
        if (column < columns) {
            large_column = columns;
        } else {
            large_column = column;
        }

        // Add if else condition to find the large value of row and column from both
        // array
        // After finding the large value form both then it add in addition of matrix
        // code
        // otherwise in the place of blank space it show the zero
        for (i = 0; i < large_row; i++) {
            for (j = 0; j < large_column; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.printf(sum[i][j] + " ");
                // Before this line define outside of j loop
                // After it define inside the j loop
                // Because it print statement one by one
            }
            System.out.println();
        }

    }
}