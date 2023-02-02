import java.util.Scanner;

public class SubtractionofMatrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter total rows:");
            int rows = sc.nextInt();

            System.out.println("Enter total columns:");
            int cols = sc.nextInt();

            //2d array:
            int matrix1[][] = new int[rows][cols];
            int matrix2[][] = new int[rows][cols];
            int sum[][] = new int[rows][cols];
            System.out.println("please enter the matrix 1 data:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("please enter the matrix 2 data:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            //print the matrix1:
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix1[i][j] + "\t");
                }
                System.out.println();
            }

            //print the matrix2:
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix2[i][j] + "\t");
                }
                System.out.println();

                //print the product of the two matrices
                System.out.println("subtraction of two matrices");
                }

            }
        }
    }


