package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго
 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
 * использовать декомпозицию.
 */

public class Task15 {

	public static void main(String[] args) {
		int n;

		n = scannerInt("Введите количество знаков");

		showAllNumbersIS(n);
	}

	private static int numberOfDigitsStart(int n) {
		int result;
		String one;
		String zero;

		result = 0;
		one = "1";
		zero = "0";

		if (n < 2) {
			System.out.println("Недостаточно знаков");
			System.exit(1);
		} else {
			for (int i = 1; i < n; i++) {
				one += zero;
			}
			result = Integer.parseInt(one);
		}

		return result;
	}

	private static int numberOfDigitsFinish(int n) {
		int result;
		String nine;
		String plusNine;

		result = 0;
		nine = "9";
		plusNine = "9";

		for (int i = 1; i < n; i++) {
			nine += plusNine;
		}
		result = Integer.parseInt(nine);

		return result;
	}

	private static boolean checkIncreasingSequence(int n) {

		String nn;
		int countTrue;
		boolean result;
		char ch1;
		char ch2;
		int element1;
		int element2;

		nn = String.valueOf(n);
		countTrue = 1;
		result = false;

		for (int i = 0; i < nn.length() - 1; i++) {
			ch1 = nn.charAt(i);
			ch2 = nn.charAt(i + 1);
			element1 = Character.getNumericValue(ch1);
			element2 = Character.getNumericValue(ch2);
			if (element1 < element2) {
				countTrue++;
			}
		}

		if (countTrue == nn.length()) {
			result = true;
		}

		return result;
	}

	private static void showAllNumbersIS(int n) {
		for (int i = numberOfDigitsStart(n); i <= numberOfDigitsFinish(n); i++) {

			if (checkIncreasingSequence(i)) {
				System.out.println(i);
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
