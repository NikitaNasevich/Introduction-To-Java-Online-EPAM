package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
* Написать метод(методы), проверяющий, являются ли данные три числа взаимно
* простыми.
*/

public class Task6 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = scannerInt("Введите первое число");
		b = scannerInt("Введите второе число");
		c = scannerInt("Введите третье число");

		if (coprimeNumbers(a, b, c)) {
			System.out.println("Числа являются взаимно простыми");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}

	}

	public static boolean coprimeNumbers(int a, int b, int c) {
		boolean result;

		result = false;

		if (getGCD(a, b) == 1 && getGCD(b, c) == 1 && getGCD(c, a) == 1) {
			result = true;
		}
		return result;
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
