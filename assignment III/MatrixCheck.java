import java.util.Scanner;

//assignmet 3.3 
// wap to find weather square matrix is
//lower triangular or upper triangular
//sparse matrix or dense matrix

public class MatrixCheck {

    public static void check(int matrix[][], int size) {
        boolean lowerFlag = false, upperlflag = false;
        int countZero = 0, count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (i < j) {
                        if (matrix[i][j] == 0) {
                            lowerFlag = true;
                            countZero++;
                        } else {
                            lowerFlag = false;
                            count++;
                        }
                    } else {
                        if (matrix[i][j] == 0) {
                            upperlflag = true;
                            countZero++;

                        } else {
                            upperlflag = false;
                            count++;
                        }
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        countZero++;
                    } else {
                        count++;
                    }
                }

            }
        }
        if (lowerFlag) {
            System.out.println("Given Matrix is Lower Triangular");
        }
        if (upperlflag) {
            System.out.println("Given Matrix is Upper Triangular");
        }
        if (countZero > count) {
            System.out.println("Given Matrix is Sparse Matrix");
        } else {
            System.out.println("GIven MAtrix is Dense Matrix");
        }
    }

    public static void main(String[] args) {

        int size;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of square matrix");
        size = scan.nextInt();
        int matrix[][] = new int[size][size];
        System.out.println("Enter elements in matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter " + (j + 1) + " element of " + (i + 1) + " row:");
                matrix[i][j] = scan.nextInt();
            }
        }
        check(matrix, size);

        scan.close();
    }
}
