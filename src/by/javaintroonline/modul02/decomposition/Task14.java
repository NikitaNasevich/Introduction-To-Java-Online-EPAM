package by.javaintroonline.modul02.decomposition;

import java.util.Scanner;

/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class Task14 {

	public static void main(String[] args) {
		int k;

		k = scannerInt("Введит число k");

		armstrongsNumbers(k);
	}

	private static int sumAndPow(int number) {
		String nn;
		double num;

		nn = String.valueOf(number);
		num = Math.pow(sumDigits(number), nn.length());

		return (int) num;
	}

	private static void armstrongsNumbers(int k) {
		for (int i = 1; i <= k; i++) {
			if (i == sumAndPow(i)) {
				System.out.println(i);
			}
		}
	}

	private static int sumDigits(int number) {
		int sum;
		String num;
		int length;
		char ch;

		sum = 0;
		num = String.valueOf(number);
		length = num.length();

		for (int i = 0; i < length; i++) {
			ch = num.charAt(i);
			sum += Character.getNumericValue(ch);
		}
		return sum;
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
