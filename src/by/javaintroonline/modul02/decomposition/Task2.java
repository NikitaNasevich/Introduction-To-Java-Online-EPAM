package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = scannerInt("Введите А ");
		b = scannerInt("Введите B ");
		c = scannerInt("Введите C ");
		d = scannerInt("Введите D ");

		System.out.println(getGCD4(a, b, c, d));

	}

	private static int getGCD(int a, int b) {
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

	private static int getGCD4(int a, int b, int c, int d) {
		int gcd1;
		int gcd2;
		int gcd3;

		gcd1 = getGCD(a, b);
		gcd2 = getGCD(gcd1, c);
		gcd3 = getGCD(gcd2, d);

		return gcd3;
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
