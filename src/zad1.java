import java.util.Scanner;

public class zad1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie liczby elementów od użytkownika
        System.out.print("Podaj liczbę elementów do posortowania: ");
        int n = scanner.nextInt();

        // Inicjalizacja tablicy o podanej liczbie elementów
        int[] array = new int[n];

        // Wprowadzanie wartości do tablicy
        System.out.println("Wprowadź elementy do posortowania:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Wywołanie metody sortującej
        bubbleSort(array);

        // Wyświetlenie posortowanej tablicy
        System.out.println("Posortowana tablica:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Metoda wykonująca sortowanie bąbelkowe
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Zamiana miejscami gdy elementy są w niewłaściwej kolejności
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Jeżeli w danej iteracji nie nastąpiła żadna zamiana, to tablica jest już posortowana
            if (!swapped) {
                break;
            }
        }
    }
}