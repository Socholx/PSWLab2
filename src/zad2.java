import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobierz długość tablicy od użytkownika
        System.out.print("Podaj długość tablicy: ");
        int length = scanner.nextInt();

        // Tworzenie tablicy o podanej długości
        double[] array = new double[length];

        // Generowanie wartości dla tablicy
        double[] allowedValues = {2, 3, 3.5, 4, 4.5, 5};
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * allowedValues.length);
            array[i] = allowedValues[randomIndex];
        }

        // Wyświetlanie tablicy
        System.out.println("Tablica: " + Arrays.toString(array));

        // Obliczanie średniej wartości
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        double average = sum / length;
        System.out.println("Średnia wartość: " + average);

        // Znajdowanie wartości minimalnej i maksymalnej
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Wartość minimalna: " + min);
        System.out.println("Wartość maksymalna: " + max);

        // Znajdowanie wartości wyższych/niższych niż średnia
        int higherCount = 0;
        int lowerCount = 0;
        for (double value : array) {
            if (value > average) {
                higherCount++;
            } else if (value < average) {
                lowerCount++;
            }
        }
        System.out.println("Liczba wartości wyższych niż średnia: " + higherCount);
        System.out.println("Liczba wartości niższych niż średnia: " + lowerCount);

        // Zliczanie częstotliwości występowania poszczególnych liczb
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        System.out.println("Częstotliwość występowania poszczególnych liczb:");
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Obliczanie średniego odchylenia standardowego
        double sumOfSquaredDifferences = 0;
        for (double value : array) {
            sumOfSquaredDifferences += Math.pow(value - average, 2);
        }
        double standardDeviation = Math.sqrt(sumOfSquaredDifferences / length);
        System.out.println("Średnie odchylenie standardowe: " + standardDeviation);
    }
}