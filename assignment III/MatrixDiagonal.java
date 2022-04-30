import java.util.Scanner;

//assignmet 3.2 
// wap to find all diagonal element of a given square matrix 

public class MatrixDiagonal {

    public static void main(String[] args) {

        int size;
        boolean flag = true;
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

        System.out.println("diagonal elements are:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1)
                    System.out.print(matrix[i][j] + ", ");

            }
        }

        scan.close();
    }
}
