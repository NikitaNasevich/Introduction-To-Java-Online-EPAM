package by.javaintroonline.modul02.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но
 * больше всех других элементов).
 */

public class Task5 {

	public static void main(String[] args) {

		int n;

		n = scannerInt("Введите количество элементов N массива А");

		double[] a = new double[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scannerDouble("Введите " + (i + 1) + " элемент массива");
		}
		System.out.println("Массив A[N] = " + Arrays.toString(a));

		printSecondMaxNumber(a);

	}

	private static void printSecondMaxNumber(double[] x) {

		double max;
		double maxSecond;

		max = 0;
		maxSecond = 0;

		for (int i = 0; i < x.length - 1; i++) {

			if (max == 0) {
				if (x[i] > x[i + 1]) {
					max = x[i];
				} else {
					max = x[i + 1];
				}
			} else if (max <= x[i]) {
				max = x[i];
			}
		}

		for (int i = 0; i < x.length - 1; i++) {
			if (maxSecond == 0) {
				if (x[i] > x[i + 1]) {
					if (max > x[i]) {
						maxSecond = x[i];
					}
				} else if (max > x[i + 1]) {
					maxSecond = x[i + 1];
				}
			} else if (maxSecond < x[i]) {
				maxSecond = x[i];
			}
		}

		System.out.println(maxSecond);

	}

	@SuppressWarnings({ "resource" })
	private static double scannerDouble(String message) {
		Scanner num = new Scanner(System.in);
		double number;
		System.out.println(message);
		while (!num.hasNextDouble()) {
			num.nextLine();
			System.out.println("Не допустимый формат!");
			System.out.println(message);
		}
		number = num.nextDouble();

		return number;
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
