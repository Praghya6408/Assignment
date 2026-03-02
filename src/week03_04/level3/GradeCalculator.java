package week03_04.level3;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average Marks: " + average);

        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Above standards");
        } 
        else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: At standards");
        } 
        else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Approaching standards");
        } 
        else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Below standards");
        } 
        else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Too below standards");
        } 
        else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }

        input.close();
    }
}