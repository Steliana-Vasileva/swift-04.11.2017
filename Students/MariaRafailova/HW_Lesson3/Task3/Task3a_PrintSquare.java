package Task3;

import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

	// Милен: БРАВО за алгоритъма ! А можеш ли да се досетиш за оптимизация ? Можеш да включиш if-ове :)
        System.out.println();

    }
}
