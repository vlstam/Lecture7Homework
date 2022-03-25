/**
 * Направете програма BMI с която да изчислите вашият Body Mass Index.
 * Пренапишете тази програма като използвате Scanner (за тегло, височина) и IF –
 * ELSE IF – ELSE, и отпечатвайте в конзолата „Overweight”, „Normal Weight”,
 * „Underweight“
 */
package mypack;

import java.util.Scanner;


public class Lecture7Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float hight;
        float weight;
        System.out.println("Please enter hight in metres: ");
        hight = scanner.nextFloat();
        System.out.println("Please enter weight in kg: ");
        weight = scanner.nextFloat();

        double bmi = weight / Math.pow(hight, 2);
        if ((bmi > 18.5) && (bmi < 24.9)) {
            System.out.println("Normal Weight");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else {
            System.out.println("Overweight");
        }

    }

}
