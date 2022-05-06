package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше
 * цифр.
 */

public class Task11 {

	public static void main(String[] args) {
		int a;
		int b;

		a = scannerInt("Введите первое число");
		b = scannerInt("Введите второе число");

		System.out.println("Больше цифр в числе :" + lengthComparsion(a, b));
	}

	private static double lengthComparsion(int a, int b) {
		String aa;
		String bb;

		aa = Integer.toString(a);
		bb = Integer.toString(b);

		if (aa.length() > bb.length()) {
			return a;
		} else {
			return b;
		}
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
