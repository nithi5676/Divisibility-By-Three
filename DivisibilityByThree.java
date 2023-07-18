package divisibilityByThree;

import java.util.Scanner;

public class DivisibilityByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(divisible(array, size));
    }

    private static int divisible(int array[], int size) {
        int result = 0, power = 0;
        for (int i = 0; i < size; i++) {
            result = (result + array[i]);

        }
        if (result % 3 == 0) {
            power = 1;
        }
        return power;

    }

}
