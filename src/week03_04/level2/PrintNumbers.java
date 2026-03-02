package week03_04.level2;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        input.close();
    }
}