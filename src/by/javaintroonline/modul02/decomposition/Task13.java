package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга
 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */

public class Task13 {

	public static void main(String[] args) {
		int n;

		n = scannerInt("Введите натуральное число больше 2");

		twinNumbers(n);
	}

	private static void twinNumbers(int n) {
		if (n <= 2) {
			System.out.println("Число должно быть больше 2");
		} else {
			for (int i = n; i <= 2 * n; i++) {
				System.out.println(i + " " + (i + 2));
			}
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
