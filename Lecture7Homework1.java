/**
 * Напишете програма SpringSeason, в която дефинирате 2 int променливи - month &
 * day. Програмата трябва да отпечатва true ако денят е между 20ти Март
 * (включително) и 20ти Юни (включително) и false в противен случай. Булева
 * стойност на израза ? „yes” : “false”
 */
package mypack;

import java.util.Scanner;


public class Lecture7Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        String month;
        System.out.println("Please enter day: ");
        day = scanner.nextInt();
        System.out.println("Please enter month: ");
        month = scanner.next();


        if ((month.equalsIgnoreCase("march")) && (day >= 20)) {
            System.out.println("True");
        } else if (month.equalsIgnoreCase("april")) {

            System.out.println("True");
        } else if (month.equalsIgnoreCase("may")) {
            System.out.println("True");
        } else if (month.equalsIgnoreCase("june") && (day <= 20)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
