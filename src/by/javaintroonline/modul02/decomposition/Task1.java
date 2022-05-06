package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: НОК(A, B) = A * B / НОД(А, В);
 */

public class Task1 {

	public static void main(String[] args) {

		int a;
		int b;
		double lcmAB;

		a = scannerInt("Введите A");
		b = scannerInt("Введите B");

		lcmAB = a * b / getGCD(a, b);

		System.out.println(lcmAB);

	}

	public static int getGCD(int a, int b) {
		if (a == 0) {
			return b;
		}
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	@SuppressWarnings("resource")
	public static int scannerInt(String message) {
		Scanner num = new Scanner(System.in);
		System.out.println(message);
		int number;
		while (!num.hasNextInt()) {
			num.next();
			System.out.println("Недопустимый формат!!!");
			System.out.println(message);
		}
		number = num.nextInt();

		return number;
	}
}
