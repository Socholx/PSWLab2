import java.util.Scanner;

public class zad3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie wymiaru macierzy od użytkownika
        System.out.print("Podaj wymiar macierzy kwadratowej: ");
        int dimension = scanner.nextInt();

        // Inicjalizacja macierzy A i B o podanym wymiarze
        int[][] matrixA = generateRandomMatrix(dimension);
        int[][] matrixB = generateRandomMatrix(dimension);

        // Wyświetlenie macierzy A i B
        System.out.println("Macierz A:");
        printMatrix(matrixA);
        System.out.println("Macierz B:");
        printMatrix(matrixB);

        // Dodawanie macierzy A i B
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        System.out.println("Suma macierzy A i B:");
        printMatrix(sumMatrix);

        // Odejmowanie macierzy B od A
        int[][] differenceMatrix = subtractMatrices(matrixA, matrixB);
        System.out.println("Różnica macierzy A i B:");
        printMatrix(differenceMatrix);

        // Mnożenie macierzy A i B
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
        System.out.println("Iloczyn macierzy A i B:");
        printMatrix(productMatrix);
    }

    // Metoda generująca macierz o podanym wymiarze z losowymi wartościami z zakresu od -10 do 10
    public static int[][] generateRandomMatrix(int dimension) {
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = (int) (Math.random() * 21) - 10;
            }
        }
        return matrix;
    }

    // Metoda wyświetlająca macierz
    public static void printMatrix(int[][] matrix) {
        int dimension = matrix.length;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Metoda dodająca dwie macierze
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int dimension = matrixA.length;
        int[][] sumMatrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }

    // Metoda odejmująca dwie macierze
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int dimension = matrixA.length;
        int[][] differenceMatrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                differenceMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return differenceMatrix;
    }

    // Metoda mnożąca dwie macierze
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int dimension = matrixA.length;
        int[][] productMatrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                for (int k = 0; k < dimension; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return productMatrix;
    }
}