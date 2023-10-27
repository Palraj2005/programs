import java.util.Scanner;

public class OneDimensionalArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / size;

        System.out.println("\nArray elements:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
