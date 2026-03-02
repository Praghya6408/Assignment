package week03_04.level1;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
        } 
        else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? Yes");
        } 
        else {
            System.out.println("Is the third number the largest? Yes");
        }

        input.close();
    }
}