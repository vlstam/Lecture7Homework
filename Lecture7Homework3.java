/**
 * Напишете програма, която прочита число от конзолата и отпечатва дали то е
 * четно или нечетно
 */
package mypack;

import java.util.Scanner;


public class Lecture7Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

}