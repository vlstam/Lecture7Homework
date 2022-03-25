/**
 * Напишете програма, която да проверя дали един триъгълник е разностранен,
 * равнобедрен или разностранен.
 * Равностранен триъгълник: За триъгълник се казва, че е равностранен
 * триъгълник, ако всички страни са равни. Ако X, Y, Z са три страни на триъгълника.
 * Тогава триъгълникът е равностранен само ако X = Y = Z.
 * Равнобедрен триъгълник: Триъгълникът се нарича равнобедрен триъгълник,
 * ако някоя от двете му страни е равни. Ако X, Y, Z са три страни на триъгълника.
 * Тогава триъгълникът е равнобедрен, ако X = Y или X = Z или Y = Z.
 * Разностранен триъгълник: Триъгълник се нарича разностранен триъгълник,
 * ако нито една от страните му не е равна.
 * 1. Въвеждате от конзолата 3 страни – X, Y, Z
 * 2. Проверете какъв тип е триъгълника
 */
package mypack;

import java.util.Scanner;


public class Lecture7Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Please enter the first vertex: ");
        a = scanner.nextByte();
        System.out.println("Please enter the second vertex: ");
        b = scanner.nextInt();
        System.out.println("Please enter the third vertex: ");
        c = scanner.nextInt();

        if ((x == y) && (y == z)) {
            System.out.println("The triangle is equilateral.");
        } else if ((x == y) || (y == z) || (x == z)) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene");
        }
    }

}
