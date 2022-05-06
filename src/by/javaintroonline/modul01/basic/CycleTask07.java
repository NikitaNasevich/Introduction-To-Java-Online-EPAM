package by.javaintroonline.modul01.basic;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 *	m и n вводятся с клавиатуры.
 */

public class CycleTask07 {

	public static void main(String[] args) {
		int m;
		int n;

		m = scannerInt("Введите число m");
		n = scannerInt("Введите число n");

		System.out.println("Промежуток чисел [" + m + "; " + n + "]");

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ": ");
			for (int t = 2; i > t; t++) {

				if (i % t == 0) {
					System.out.print(" " + t);
				}
			}

		}

	}

	@SuppressWarnings("resource")
	private static int scannerInt(String s) {
		Scanner num = new Scanner(System.in);
		int number;
		System.out.println(s);
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("Недопустимый формат!");
			System.out.println(">>");
		}
		number = num.nextInt();

		return number;
	}

}
