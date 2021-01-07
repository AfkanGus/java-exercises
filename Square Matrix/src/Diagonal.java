public class Diagonal {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        int size = 5;
        int x = 0;
        /*Get the square matrix*/
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = x++;
                System.out.printf("%d\t", +matrix[i][j]);
            }
            System.out.printf("\n");
        }

        /*Print the main diagonal elements
         from the bottom right corner*/
        System.out.println("from the lower right corner");
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.printf(matrix[i][j] + "\t");
                } else {
                    System.out.printf("\t");

                }
            }
            System.out.println();

        }
        System.out.println("\nfrom the top left corner");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.printf(matrix[i][j] + "\t");
                } else {
                    System.out.printf("\t");

                }
            }
            System.out.println();

        }
        System.out.println("\nElements above main diagonal: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j)
                    System.out.printf("%d\t", matrix[i][j]);

            }
            System.out.printf("\n");

        }
        System.out.println("\nElements below main diagonal");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    System.out.printf("%d\t", matrix[i][j]);
                }
            }
            System.out.printf("\n");

        }
        System.out.println("\nElements on secondary diagonal");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.printf(matrix[i][j] + "\t");
                } else {
                    System.out.printf("\t");

                }
            }
            System.out.println();

        }

        System.out.println("\nAddress of elements above secondary diagonal");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j < size - 1) {
                    System.out.printf("%d\t", matrix[i][j]);
                }
            }
            System.out.printf("\n");

        }
        System.out.println("\nElements below secondary diagonal");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j > size - 1)
                    System.out.printf("%d\t", matrix[i][j]);

            }
            System.out.printf("\n");

        }

        System.out.println("\nCorner elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // check for corner elements
                if ((i == 0 || i == size - 1) && (j == 0 || j == size - 1))
                    System.out.printf("%d\t", matrix[i][j]);

            }
            System.out.printf("\n");

        }

        System.out.println("Boundary elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0
                        || j == 0
                        || i == size - 1
                        || j == size - 1) {
                    System.out.printf(matrix[i][j] + "\t");
                } else {
                    System.out.printf("\t");
                }

            }
            System.out.println();

        }
    }
}
/*Write a Java program to read a square matrix
 * and print the main diagonal elements*/